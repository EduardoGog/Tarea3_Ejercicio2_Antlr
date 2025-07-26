import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends MiniLangBaseVisitor<Integer>{
    /* Almacenar variables y su valor*/
    private Map<String,Integer> memory = new HashMap<>();

    /*Visita el nodo raíz 'programa' y ejecuta todas las instrucciones una por una.*/
    @Override
    public Integer visitPrograma(MiniLangParser.ProgramaContext ctx) {
        for(var instruccion : ctx.instruccion()){
            visit(instruccion);
        }
        return 0;
    }

    /* Manejo de variables, se declara nombre de variable, su valor y el guardado en la memoria */
    @Override
    public Integer visitDeclaracion(MiniLangParser.DeclaracionContext ctx) {
        String nombre = ctx.ID().getText();
        int valor = visit(ctx.expr());
        memory.put(nombre,valor);
        return valor;
    }

    /* Manejo de asiganciones como a = 2, si una variable no es declarada lanza una excepción */
    @Override
    public Integer visitAsignacion(MiniLangParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();
        int valor = visit(ctx.expr());
        if (!memory.containsKey(nombre)) {
            throw new RuntimeException("Variable no declarada: " + nombre);
        }
        memory.put(nombre, valor); // Actualizar valor
        return valor;
    }

    /* Ejecuta una instrucción de impresión: print x, muestra en consola el resultado de la expresión. */
    @Override
    public Integer visitImprimir(MiniLangParser.ImprimirContext ctx) {
        int valor = visit(ctx.expr());
        System.out.println(valor);
        return valor;
    }

    /* Ejecuta una estructura condicional: if ... then ... endif, solo ejecuta las instrucciones internas si la condición es distinta de 0.*/
    @Override
    public Integer visitIf(MiniLangParser.IfContext ctx) {
        int condicion = visit(ctx.expr());
        if(condicion != 0){
            for(var instruccion : ctx.instruccion()){
                visit(instruccion);
            }
        }
        return 0;
    }

    /* Ejecuta un bucle while: while ... do ... endwhile, repite las instrucciones internas mientras la condición sea distinta de 0 */
    @Override
    public Integer visitWhile(MiniLangParser.WhileContext ctx) {
        while (visit(ctx.expr()) != 0) {
            for (var instr : ctx.instruccion()) {
                visit(instr);
            }
        }
        return 0;
    }

    /* Evalúa una expresión de suma o resta: a + b o a - b */
    @Override
    public Integer visitAddSub(MiniLangParser.AddSubContext ctx) {
        int izq = visit(ctx.expr(0));
        int der = visit(ctx.expr(1));
        return ctx.op.getText().equals("+") ? izq + der : izq - der;
    }

    /* Evalúa una expresión de multiplicación o división: a * b o a / b */
    @Override
    public Integer visitMulDiv(MiniLangParser.MulDivContext ctx) {
        int izq = visit(ctx.expr(0));
        int der = visit(ctx.expr(1));
        return ctx.op.getText().equals("*") ? izq * der : izq / der;
    }

    /* Evalúa una expresión entre paréntesis: (a + b) */
    @Override
    public Integer visitParentesis(MiniLangParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }

    /* Retorna el valor numérico de un literal (número entero). */
    @Override
    public Integer visitLiteral(MiniLangParser.LiteralContext ctx) {
        return Integer.parseInt(ctx.NUMERO().getText());
    }

    /* Retorna el valor de una variable previamente declarada, lanza error si la variable no existe en memoria. */
    @Override
    public Integer visitVariable(MiniLangParser.VariableContext ctx) {
        String id = ctx.ID().getText();
        if (!memory.containsKey(id)) {
            throw new RuntimeException("Variable no declarada: " + id);
        }
        return memory.get(id);
    }
}
