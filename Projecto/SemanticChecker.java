import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class SemanticChecker extends programBaseListener {
	
	/*
	Inteiro que vai guardar o numero de erros semânticos do programa
	Os erros podem ser:	- variável não definida;
						- imagens com tamanhos diferentes (no blend);
	*/
	private int errorCount;
	
	public String lastOperation;
	
	/*
	Mapa para armazenamento das variáveis
	Vai guardar todas as variáveis do sistema
	*/
	private Map<String, String> mapping;
	
	public SemanticChecker() {
		errorCount = 0;
		mapping = new HashMap<>();
	}
	
	public int getNumberOfErrors() {
		return errorCount;
	}
	
	public HashMap<String, String> getMapping() {
		return (HashMap<String, String>) mapping;
	}
	
	@Override
	public void exitAssignOperation(programParser.AssignOperationContext ctx) {
		String variable = ctx.VAR().getText();
		mapping.put(variable, lastOperation);
	}
	
	@Override
	public void exitAssignImage(programParser.AssignImageContext ctx) {
		String variable = ctx.VAR().getText();
		String value = ctx.IMAGE().getText();
		if (!(verifyExistance(value)))
      		return;
		mapping.put(variable, value);
		lastOperation = value;
	}
	
	@Override
	public void exitAssignVar(programParser.AssignVarContext ctx){
		String variable1 = ctx.VAR(0).getText();
		String variable2 = ctx.VAR(1).getText();
		String value = mapping.get(variable2);
		if (value == null) {
			System.err.println("ERRO!: A variavel " + variable2 + " não existe!\n");
			errorCount ++;
			return;
		}
		if (!(verifyExistance(value)))
      		return;
		mapping.put(variable1, value);
		lastOperation = value;
	}
	
	@Override
	public void exitShowImage(programParser.ShowImageContext ctx) {
		String value = ctx.IMAGE().getText();
		if (!(verifyExistance(value)))
      		return;
		lastOperation = value;
	}
	
	@Override
	public void exitShowVar(programParser.ShowVarContext ctx) {
		String variable = ctx.VAR().getText();
		String value = mapping.get(variable);
		if (value == null) {
			System.err.println("ERRO!: A variavel " + variable + " não existe!\n");
			errorCount++;
			return;
		}
		if (!(verifyExistance(value)))
      		return;
		lastOperation = value;
	}
	
	@Override
   	public void exitResizeImage(programParser.ResizeImageContext ctx) {
      	String value = ctx.IMAGE().getText();
      	if (!(verifyExistance(value)))
      		return;
      	lastOperation = value;
   	}
   	
   	@Override
   	public void exitResizeVar(programParser.ResizeVarContext ctx) {
      	String variable = ctx.VAR().getText();
      	String value = mapping.get(variable);
      	if (value == null) {
			System.err.println("ERRO!: A variavel " + variable + " não existe!\n");
			errorCount++;
			return;
		}
		if (!(verifyExistance(value)))
      		return;
      	lastOperation = value;
   	}
   	
	@Override
   	public void exitRotateImage(programParser.RotateImageContext ctx) {
      	String value = ctx.IMAGE().getText();
      	if (!(verifyExistance(value)))
      		return;
      	lastOperation = value;
   	}
   	
   	@Override
   	public void exitRotateVar(programParser.RotateVarContext ctx) {
      	String variable = ctx.VAR().getText();
      	String value = mapping.get(variable);
      	if (value == null) {
			System.err.println("ERRO!: A variavel " + variable + " não existe!\n");
			errorCount++;
			return;
		}
		if (!(verifyExistance(value)))
      		return;
      	lastOperation = value;
   	}

	@Override
   	public void exitCannyImage(programParser.CannyImageContext ctx) {
      	String value = ctx.IMAGE().getText();
      	if (!(verifyExistance(value)))
      		return;
      	lastOperation = value;
   	}

	@Override
   	public void exitCannyVar(programParser.CannyVarContext ctx) {
      	String variable = ctx.VAR().getText();
      	String value = mapping.get(variable);
      	if (value == null) {
			System.err.println("ERRO!: A variavel " + variable + " não existe!\n");
			errorCount++;
			return;
		}
		if (!(verifyExistance(value)))
      		return;
      	lastOperation = value;
   	}

	@Override
   	public void exitBlurImage(programParser.BlurImageContext ctx) {
      	String value = ctx.IMAGE().getText();
      	if (!(verifyExistance(value)))
      		return;
      	lastOperation = value;
   	}

	@Override
   	public void exitBlurVar(programParser.BlurVarContext ctx) {
      	String variable = ctx.VAR().getText();
      	String value = mapping.get(variable);
      	if (value == null) {
			System.err.println("ERRO!: A variavel " + variable + " não existe!\n");
			errorCount++;
			return;
		}
		if (!(verifyExistance(value)))
      		return;
      	lastOperation = value;
   	}
	
	@Override
	public void exitBlendImage(programParser.BlendImageContext ctx){
		String value = ctx.IMAGE(0).getText();
     	String value2 = ctx.IMAGE(1).getText();
     	if (!(verifyExistance(value)))
      		return;
      	if (!(verifyExistance(value2)))
      		return;
     	try {
			BufferedImage bimg = ImageIO.read(new File(value));
			int width1 = bimg.getWidth();
			int height1 = bimg.getHeight();
			bimg = ImageIO.read(new File(value2));
			int width2 = bimg.getWidth();
			int height2 = bimg.getHeight();
			if (width1 != width2 || height1 != height2){
				System.err.println("ERRO!: As imagens não têm o mesmo tamanho! É impossível fazer blend!\n");
				errorCount++;
				return;
			}
		} catch (IOException e) {
		}
      	String[] image1 = value.split("\\.");
      	String[] image2 = value2.split("\\.");
		lastOperation = image1[0] + image2[0] +".png";
	}

	@Override
	public void exitBlendImageVar(programParser.BlendImageVarContext ctx){
		String value = ctx.IMAGE().getText();
     	String variable = ctx.VAR().getText();
      	String value2 = mapping.get(variable);
      	if (value2 == null) {
			System.err.println("ERRO!: A variavel " + variable + " não existe!\n");
			errorCount++;
			return;
		}
		if (!(verifyExistance(value)))
      		return;
      	if (!(verifyExistance(value2)))
      		return;
		try {
			BufferedImage bimg = ImageIO.read(new File(value));
			int width1 = bimg.getWidth();
			int height1 = bimg.getHeight();
			bimg = ImageIO.read(new File(value2));
			int width2 = bimg.getWidth();
			int height2 = bimg.getHeight();
			if (width1 != width2 || height1 != width2){
				System.err.println("ERRO!: As imagens não têm o mesmo tamanho! É impossível fazer blend!\n");
				errorCount++;
				return;
			}
		} catch (IOException e) {
		}
      	String[] image1 = value.split("\\.");
      	String[] image2 = value2.split("\\.");
      	lastOperation = image1[0] + image2[0] +".png";
	}
	
	@Override
	public void exitBlendVarImage(programParser.BlendVarImageContext ctx){
		String variable = ctx.VAR().getText();
     	String value = mapping.get(variable);
     	String value2 = ctx.IMAGE().getText();
     	if (value == null) {
			System.err.println("ERRO!: A variavel " + variable + " não existe!\n");
			errorCount++;
			return;
		}
		if (!(verifyExistance(value)))
      		return;
      	if (!(verifyExistance(value2)))
      		return;
		try {
			BufferedImage bimg = ImageIO.read(new File(value));
			int width1 = bimg.getWidth();
			int height1 = bimg.getHeight();
			bimg = ImageIO.read(new File(value2));
			int width2 = bimg.getWidth();
			int height2 = bimg.getHeight();
			if (width1 != width2 || height1 != width2){
				System.err.println("ERRO!: As imagens não têm o mesmo tamanho! É impossível fazer blend!\n");
				errorCount++;
				return;
			}
		} catch (IOException e) {
		}
      	String[] image1 = value.split("\\.");
      	String[] image2 = value2.split("\\.");
		lastOperation = image1[0] + image2[0] +".png";
	}
	
	@Override
	public void exitBlendVar(programParser.BlendVarContext ctx){
		String variable = ctx.VAR(0).getText();
     	String variable2 = ctx.VAR(1).getText();
      	String value = mapping.get(variable);
      	String value2 = mapping.get(variable2);
      	if (value == null) {
			System.err.println("ERRO!: A variavel " + variable + " não existe!\n");
			errorCount++;
			return;
		}
		if (!(verifyExistance(value)))
      		return;
		if (value2 == null) {
			System.err.println("ERRO!: A variavel " + variable2 + " não existe!\n");
			errorCount++;
			return;
		}
		if (!(verifyExistance(value2)))
      		return;
		try {
			BufferedImage bimg = ImageIO.read(new File(value));
			int width1 = bimg.getWidth();
			int height1 = bimg.getHeight();
			bimg = ImageIO.read(new File(value2));
			int width2 = bimg.getWidth();
			int height2 = bimg.getHeight();
			if (width1 != width2 || height1 != width2){
				System.err.println("ERRO!: As imagens não têm o mesmo tamanho! É impossível fazer blend!\n");
				errorCount++;
				return;
			}
		} catch (IOException e) {
		}
      	String[] image1 = value.split("\\.");
      	String[] image2 = value2.split("\\.");
		lastOperation = image1[0] + image2[0] +".png";
	}
	
	@Override
	public void exitSaveImage(programParser.SaveImageContext ctx) {
		String value = ctx.IMAGE().getText();
		if (!(verifyExistance(value)))
      		return;
	}
	
  	@Override
   	public void exitSaveVar(programParser.SaveVarContext ctx) {
		String variable = ctx.VAR().getText();
		String value = mapping.get(variable);
		if (value == null) {
			System.err.println("ERRO!: A variavel " + variable + " não existe!\n");
			errorCount++;
		}
		if (!(verifyExistance(value)))
      		return;
	}
	
	public boolean verifyExistance(String value){
		if (!(new File(value).exists())){
      		System.err.println("ERRO!: A imagem \"" + value + "\" não existe!\n");
      		errorCount++;
      		return false;
      	}
      	return true;
	}
}
