import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;

public class programMainFile {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Nome do ficheiro: ");
      String filename = sc.next();
      InputStream in_stream = null;
      try {
         in_stream = new FileInputStream(new File(filename));
      }
      catch(FileNotFoundException e) {
         err.println("ERROR: reading number file!");
         exit(1);
      }
      System.out.println("No final do programa aparecerão janelas a mostrar todas as operações realizadas sobre as imagens.\n"
      + "\nAs imagens gravadas irão ser guardadas numa pasta chamada \"output\"");
        // create a CharStream that reads from standard input:
      ANTLRInputStream input = new ANTLRInputStream(in_stream);
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
