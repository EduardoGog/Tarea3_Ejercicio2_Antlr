import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Launcher {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Úsalo de esta manera: java Launcher <entrada.txt>");
            return;
        }
        try {
            String entrada = args[0];
            CharStream stream = CharStreams.fromFileName(entrada);

            MiniLangLexer lexer = new MiniLangLexer(stream);
            MiniLangParser parser = new MiniLangParser(new CommonTokenStream(lexer));

            ParseTree arbol = parser.programa();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(arbol);
        } catch (Exception e) {
            System.err.println("Error al procesar el archivo de entrada: " + e.getMessage());
        }

    }
}
