import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class programMain {
   public static void main(String[] args) throws Exception {
      System.out.println("Utilização do programa:\n"
      + "\n\tMostrar imagem - show <imagem>(ou <variável>)\n"
      + "\tMudar tamanho de uma imagem - resize <imagem>(ou <variável>) <valor comprimento>, <valor altura>\n"
      + "\tRodar uma imagem - rotate <imagem>(ou <variavel>) <ângulo>\n"
      + "\t\"Canny\" de uma imagem - canny <imagem>(ou <variavel>)\n"
      + "\t\"Blending\" de duas imagens - blend <imagem>(ou <variavel>), <imagem>(ou <variavel>)\n"
      + "\t\"Blurring\" de uma imagem - blur <imagem>(ou <variavel>)\n"
      + "\tGuardar uma imagem - save <imagem>(ou <variavel>)\n"
      + "\nSe pretender continuar a trabalhar sobre uma imagem blended, utilize como input de imagem o nome de ambas as imagens\n"
      + "\tExemplo: blend imagem1.png, imagem2.jpg\n\t<operacao> imagem1imagem2.png\n"
      + "\nNo final do programa aparecerão janelas a mostrar todas as operações realizadas sobre as imagens.\n"
      + "\nAs imagens gravadas irão ser guardadas numa pasta chamada \"output\"\n");
        // create a CharStream that reads from standard input:
      ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream:
      programLexer lexer = new programLexer(input);
        // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer:
      programParser parser = new programParser(tokens);
        // begin parsing at run rule:
      ParseTree tree = parser.run();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         ParseTreeWalker walker = new ParseTreeWalker();
         SemanticChecker listener = new SemanticChecker();
         walker.walk(listener, tree);
         if (listener.getNumberOfErrors() == 0) {
         	ConstructCode generator = new ConstructCode(listener.getMapping());
         	walker.walk(generator, tree);
         }
      }
   }
}
