import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/* Lee un archivo de entrada, lo analiza sintácticamente y ejecuta las instrucciones usando un Visitor. */
public class Launcher {
    public static void main(String[] args) {
        /* Verifica que se haya proporcionado un archivo como argumento en la línea de comandos.
         * Si no se proporciona, muestra un mensaje de error y termina el programa. */
        if (args.length == 0) {
            System.err.println("Úsalo de esta manera: java Launcher <entrada.txt>");
            return;
        }
        try {
            /* Carga el archivo de entrada especificado como argumento. */
            String entrada = args[0];
            CharStream stream = CharStreams.fromFileName(entrada);

            /* Carga el archivo de entrada especificado como argumento. */
            MiniLangLexer lexer = new MiniLangLexer(stream);

            /* Pasa los tokens generados al parser para construir el árbol sintáctico. */
            MiniLangParser parser = new MiniLangParser(new CommonTokenStream(lexer));

            /* Llama a la regla inicial del parser (programa) para generar el árbol de análisis. */
            ParseTree arbol = parser.programa();

            /* Crea un visitor personalizado que recorrerá el árbol y ejecutará la lógica del lenguaje. */
            MyVisitor visitor = new MyVisitor();

            /* Visita el árbol completo, ejecutando las instrucciones del archivo fuente. */
            visitor.visit(arbol);
        } catch (Exception e) {
            /* Captura cualquier error al leer el archivo o ejecutar el visitor, e imprime un mensaje de error. */
            System.err.println("Error al procesar el archivo de entrada: " + e.getMessage());
        }

    }
}
