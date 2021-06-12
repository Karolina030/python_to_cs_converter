import java.util.Dictionary;
import java.util.Hashtable;

import static java.util.stream.Collectors.toList;

public class Python_grammarListenerImpl extends  Python_grammarBaseListener{
    private final CsCodeAssembler csCodeAssembler = new CsCodeAssembler();
    private final Dictionary<String, String> variables = new Hashtable<>();
    private int tabs = 0;

    public CsCodeAssembler getCode(){
        return csCodeAssembler;
    }

    @Override
    public void exitAssignment_stmt(Python_grammarParser.Assignment_stmtContext ctx) {
        String varName = ctx.VAR().getText();
        String varValue = ctx.expr().getText();

        if (variables.get(varName) != null) {
            addExpression(varName + " = " + varValue + ";");
        } else {
            variables.put(varName, varValue);
            addExpression("var " + varName + " = " + varValue + ";");
        }
    }

    @Override
    public void enterBody(Python_grammarParser.BodyContext ctx) {
        tabs++;
    }

    @Override
    public void exitBody(Python_grammarParser.BodyContext ctx) {
        tabs--;
    }

    @Override
    public void enterList_assignment_stmt(Python_grammarParser.List_assignment_stmtContext ctx) {
        String varName = ctx.VAR().getText();
        addExpression("int[] "+varName + " = " + ctx.variable().stream().map(x->x.getText()).collect(toList()).toString().replace("[","{").replace("]", "};"));
    }

    @Override
    public void enterIf_stmt(Python_grammarParser.If_stmtContext ctx) {
        addExpression("if (" + ctx.expr_bool().getText().replace("or", " || ").replace("and", " && ").replace("not ", "!") + ") {");
    }

    @Override
    public void exitIf_stmt(Python_grammarParser.If_stmtContext ctx) {
        if (ctx.elif_stmt() == null && ctx.else_stmt() == null)
            addExpression("}");
    }

    @Override
    public void enterElif_stmt(Python_grammarParser.Elif_stmtContext ctx) {
        addExpression("}\nelse if (" + ctx.expr_bool().getText() + ") {");
    }

    @Override
    public void exitElif_stmt(Python_grammarParser.Elif_stmtContext ctx) {
        addExpression("}");
    }

    @Override
    public void enterElse_stmt(Python_grammarParser.Else_stmtContext ctx) {
        addExpression("else {");
    }

    @Override
    public void exitElse_stmt(Python_grammarParser.Else_stmtContext ctx) {
        addExpression("}");
    }

    @Override
    public void enterWhile_stmt(Python_grammarParser.While_stmtContext ctx) { addExpression("while (" + ctx.expr_bool().getText() + ") {"); }

    @Override
    public void exitWhile_stmt(Python_grammarParser.While_stmtContext ctx) { addExpression("}"); }


    @Override
    public void enterFor_stmt(Python_grammarParser.For_stmtContext ctx) {
        addExpression("foreach (int " + ctx.VAR().get(0) + " in "+ ctx.VAR().get(1) +") {");}

    @Override
    public void exitFor_stmt(Python_grammarParser.For_stmtContext ctx) { addExpression("}"); }


    @Override
    public void enterPrint_stmt(Python_grammarParser.Print_stmtContext ctx) {
        addExpression("Console.WriteLine("+ ctx.expr().getText()+");");
    }

    private void addExpression(String expression){
        csCodeAssembler.addExpression(getTabs() + expression);
    }

    private String getTabs(){
        return "\t".repeat(tabs);
    }
}
