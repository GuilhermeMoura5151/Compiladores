import java.util.*;
import java.io.*;

public class ConstructCode extends programBaseListener {
	
	/*
	Para escrever no ficheiro
	*/
	private BufferedWriter out;
	private FileWriter fw;
	
	/*
	Corpo do output
	*/
	private String text;
	
	/*
	Mapa para armazenamento das variáveis
	<nome da variável, designação da imagem no programa em python>
	*/
	private Map<String, String> mapping;
	
	/*
	flags para bloquear repetições de código
	flag -> impedir que se faça import numpy as np,sys mais do que uma vez
	flagRead -> impedir que se faça imRead mais do que uma vez para cada imagem
	*/
	private boolean flag;
	private boolean flagRead;
	
	/*
	Array que armazena os nomes das imagens, o que impede a repetição de variáveis
	<nome da imagem> 
	*/
	private List<String> images;
	
	/*
	Notas:
	 -> O waitkey(0) serve para manter a janela do imshow aberta até que o utilizador a decida fechar
	*/
	
	//Construtor
	public ConstructCode(HashMap<String,String> map){
		try {
			fw = new FileWriter("out.py");
			out=new	BufferedWriter(fw);
			text = "import cv2\nimport os\n\n#código autogerado\n";
			mapping = map;
			images = new ArrayList<>();
			flag = false;
			flagRead = true;
		} catch (Exception e){
			System.err.println("ERRO: " + e + "\n");
			System.exit(1);
		}
	}
	
	/*
	Função para verificar se o imread já foi efetuado(ou não) numa imagem:
		value -> string com o nome da imagem;
		images -> array contendo todas as imagens passadas ao programa;
	Retorna o nome da imagem (sem a extensão), para servir de nome de variável no programa python gerado
	*/
	public String verifyImage(String value){
		String[] image = value.split("\\.");
      	if (!images.contains(value)){
			flagRead = true;
			images.add(value);
		}
		if (flagRead) {
			text = text + image[0] + " = cv2.imread(\""+ value +"\")\n";
			flagRead = false;
		}
		return image[0];
	}
	
	@Override
	public void exitAssignImage(programParser.AssignImageContext ctx) {
		String value = ctx.IMAGE().getText();
		if (!images.contains(value)){
			flagRead = true;
			images.add(value);
		} else {
			flagRead = false;
		}

	}
	
	@Override
	public void exitAssignVar(programParser.AssignVarContext ctx){
		String variable2 = ctx.VAR(1).getText();
		String value = mapping.get(variable2);
		if (!images.contains(value)){
			flagRead = true;
			images.add(value);
		} else {
			flagRead = false;
		}
	}
	
	@Override
	public void exitShowImage(programParser.ShowImageContext ctx) {
		String value = ctx.IMAGE().getText();
		String image = verifyImage(value);
		text = text + "cv2.imshow(\"" + image +"\"," + image + ")\ncv2.waitKey(0)\n";
	}
	
	@Override
	public void exitShowVar(programParser.ShowVarContext ctx) {
		String variable = ctx.VAR().getText();
		String value = mapping.get(variable);
		String image = verifyImage(value);
		text = text + "cv2.imshow(\"" + image +"\", " + image + ")\ncv2.waitKey(0)\n";
	}
	
	@Override
   	public void exitResizeImage(programParser.ResizeImageContext ctx) {
      	String value = ctx.IMAGE().getText();
      	int x = Integer.parseInt(ctx.INT(0).getText());
      	int y = Integer.parseInt(ctx.INT(1).getText());
      	String image = verifyImage(value);
     	text = text + "#Image resize\n";
      	text = text + image + " = cv2.resize(" + image + ", (" + x + ", " + y + "))\n";
   	}
   	
   	@Override
   	public void exitResizeVar(programParser.ResizeVarContext ctx) {
      	String variable = ctx.VAR().getText();
      	int x = Integer.parseInt(ctx.INT(0).getText());
      	int y = Integer.parseInt(ctx.INT(1).getText());
      	String value = mapping.get(variable);
      	String image = verifyImage(value);
      	text = text + "#Image resize\n";
      	text = text + image + " = cv2.resize(" + image + ", (" + x + ", " + y + "))\n";
   	}
   	
	@Override
   	public void exitRotateImage(programParser.RotateImageContext ctx) {
      	String value = ctx.IMAGE().getText();
      	int angle = Integer.parseInt(ctx.INT().getText());
      	String image = verifyImage(value);
     	text = text + "#Image rotation\n";
      	text = text + "(h, w) = " + image + ".shape[:2]\ncenter = (w / 2, h / 2)\n";
      	text = text + "M = cv2.getRotationMatrix2D(center, " + angle + ", 1.0)\n" + image + " = cv2.warpAffine(" + image + ", M, (w, h))\n";
   	}
   	
   	@Override
   	public void exitRotateVar(programParser.RotateVarContext ctx) {
      	String variable = ctx.VAR().getText();
      	String value = mapping.get(variable);
      	int angle = Integer.parseInt(ctx.INT().getText());
      	String image = verifyImage(value);
      	text = text + "#Image rotation\n";
      	text = text + "(h, w) = " + image + ".shape[:2]\ncenter = (w / 2, h / 2)\n";
      	text = text + "M = cv2.getRotationMatrix2D(center, " + angle + ", 1.0)\n" + image + " = cv2.warpAffine(" + image + ", M, (w, h))\n";
   	}

	@Override
   	public void exitCannyImage(programParser.CannyImageContext ctx) {
      	String value = ctx.IMAGE().getText();
      	if (!flag){
      		text = "import numpy as np,sys\n" + text;
      		flag = true;
      	}
      	String image = verifyImage(value);
		text = text + "#Image canny\n";
      	text = text + image + " = cv2.Canny(" + image + ",100,200)\n";
   	}

	@Override
   	public void exitCannyVar(programParser.CannyVarContext ctx) {
      	String variable = ctx.VAR().getText();
      	String value = mapping.get(variable);
      	if (!flag){
      		text = "import numpy as np,sys\n" + text;
      		flag = true;
      	}
      	String image  = verifyImage(value);
		text = text + "#Image canny\n";
      	text = text + image +" = cv2.Canny(" + image + ",100,200)\n";
   	}

	@Override
   	public void exitBlurImage(programParser.BlurImageContext ctx) {
      	String value = ctx.IMAGE().getText();
      	String image = verifyImage(value);
      	text = text + "#Image blurring\n";
      	text = text + image + " = cv2.blur(" + image + ", (5, 5))\n";
   	}

	@Override
   	public void exitBlurVar(programParser.BlurVarContext ctx) {
      	String variable = ctx.VAR().getText();
      	String value = mapping.get(variable);
		String image = verifyImage(value);
      	text = text + "#Image blurring\n";
      	text = text + image + " = cv2.blur(" + image + ", (5, 5))\n";
   	}
	
	@Override
	public void exitBlendImage(programParser.BlendImageContext ctx){
		String value = ctx.IMAGE(0).getText();
     	String value2 = ctx.IMAGE(1).getText();
      	if (!flag){
      		text = "import numpy as np,sys\n" + text;
      		flag = true;
      	}
      	String image1 = verifyImage(value);
      	String image2 = verifyImage(value2);
		text = text + "#Image blending\n";
      	text = text+ ("" + image1+image2 + " = cv2.addWeighted(" + image1 + ",0.5," + image2 + ",0.5,0)\n");
		images.add(image1 + image2 +".png");
	}

	@Override
	public void exitBlendImageVar(programParser.BlendImageVarContext ctx){
		String value = ctx.IMAGE().getText();
     	String variable = ctx.VAR().getText();
      	String value2 = mapping.get(variable);
      	if (!flag){
      		text = "import numpy as np,sys\n" + text;
      		flag = true;
      	}
      	String image1 = verifyImage(value);
      	String image2 = verifyImage(value2);
		text = text + "#Image blending\n";
      	text = text+ ("" + image1+image2 + " = cv2.addWeighted(" + image1 + ",0.5," + image2 + ",0.5,0)\n");
		images.add(image1 + image2 +".png");
	}
	
	@Override
	public void exitBlendVarImage(programParser.BlendVarImageContext ctx){
		String variable = ctx.VAR().getText();
     	String value = mapping.get(variable);
     	String value2 = ctx.IMAGE().getText();
      	if (!flag){
      		text = "import numpy as np,sys\n" + text;
      		flag = true;
      	}
      	String image1 = verifyImage(value);
      	String image2 = verifyImage(value2);
		text = text + "#Image blending\n";
      	text = text+ ("" + image1+image2 + " = cv2.addWeighted(" + image1 + ",0.5," + image2 + ",0.5,0)\n");
		images.add(image1 + image2 +".png");
	}
	
	@Override
	public void exitBlendVar(programParser.BlendVarContext ctx){
		String variable = ctx.VAR(0).getText();
     	String variable2 = ctx.VAR(1).getText();
      	String value = mapping.get(variable);
      	String value2 = mapping.get(variable2);
      	if (!flag){
      		text = "import numpy as np,sys\n" + text;
      		flag = true;
      	}
      	String image1 = verifyImage(value);
      	String image2 = verifyImage(value2);
		text = text + "#Image blending\n";
      	text = text + image1+image2 + " = cv2.addWeighted(" + image1 + ",0.5," + image2 + ",0.5,0)\n";
		images.add(image1 + image2 +".png");
	}
	
	@Override
   	public void exitSaveImage(programParser.SaveImageContext ctx) {
		String value = ctx.IMAGE().getText();
		String[] image = value.split("\\.");
		text = text + "#Image save\n"
		+ "realPath = os.path.realpath(\"out\")\n"
		+ "dirPath = os.path.dirname(realPath)\n"
		+ "newPath = dirPath+\"/output\"\n"
		+ "if not os.path.exists(newPath):\n"
    	+ "\tos.makedirs(newPath)\n"
		+ "cv2.imwrite(str(newPath) + \"/output_" + value + "\", " + image[0] + ")\n";
	}
	
  	@Override
   	public void exitSaveVar(programParser.SaveVarContext ctx) {
		String variable = ctx.VAR().getText();
		String value = mapping.get(variable);
		String[] image = value.split("\\.");
		text = text + "#Image save\n"
		+ "realPath = os.path.realpath(\"out\")\n"
		+ "dirPath = os.path.dirname(realPath)\n"
		+ "newPath = dirPath+\"/output\"\n"
		+ "if not os.path.exists(newPath):\n"
    	+ "\tos.makedirs(newPath)\n"
		+ "cv2.imwrite(str(newPath) + \"/output_" + value + "\", " + image[0] + ")\n";
	}
		
	@Override
   	public void exitRun(programParser.RunContext ctx) {
   		text = "#encoding: UTF-8\n" + text;
   		for (String image: images){
   			String[] splitted = image.split("\\.");
   			text = text + "#Image show\ncv2.imshow(\"" + splitted[0] + "\", " + splitted[0] + ")\ncv2.waitKey(0)\n";
   		}
     	try{
			out.write(text);
			out.close();
		} catch(IOException e) {
		}
	}	
}
