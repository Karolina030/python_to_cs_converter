import java.util.Dictionary;
import java.util.Hashtable;

import static java.util.stream.Collectors.toList;

public class Python_grammarListenerImpl extends  Python_grammarBaseListener{
    private final CsCodeAssembler csCodeAssembler = new CsCodeAssembler();
    private final Dictionary<String, String> variables = new Hashtable<>();

    public CsCodeAssembler getCode(){
        return csCodeAssembler;
    }

    @Override
    public void exitAssignment_stmt(Python_grammarParser.Assignment_stmtContext ctx) {
        String varName = ctx.VAR().getText();
        String varValue = ctx.expr().getText();

        if (variables.get(varName) != null) {
            csCodeAssembler.addExpression(varName + " = " + varValue + ";");
        } else {
            variables.put(varName, varValue);
            csCodeAssembler.addExpression("var " + varName + " = " + varValue + ";");
        }
    }

    @Override
    public void enterList_assignment_stmt(Python_grammarParser.List_assignment_stmtContext ctx) {
        String varName = ctx.VAR().getText();
        csCodeAssembler.addExpression("int[] "+varName + " = " + ctx.variable().stream().map(x->x.getText()).collect(toList()).toString().replace("[","{").replace("]", "};"));
    }

    @Override
    public void enterIf_stmt(Python_grammarParser.If_stmtContext ctx) {
        csCodeAssembler.addExpression("if (" + ctx.expr_bool().getText().replace("or", " || ").replace("and", " && ").replace("not ", "!") + ") {");
    }

    @Override
    public void exitIf_stmt(Python_grammarParser.If_stmtContext ctx) {
        csCodeAssembler.addExpression("}");
    }

    @Override
    public void enterElif_stmt(Python_grammarParser.Elif_stmtContext ctx) {
        csCodeAssembler.addExpression("}\nelse if (" + ctx.expr_bool().getText() + ") {");
    }

    @Override
    public void exitElif_stmt(Python_grammarParser.Elif_stmtContext ctx) {
        csCodeAssembler.addExpression("}");
    }

    @Override
    public void enterElse_stmt(Python_grammarParser.Else_stmtContext ctx) {
        csCodeAssembler.addExpression("else {");
    }

    @Override
    public void exitElse_stmt(Python_grammarParser.Else_stmtContext ctx) {
        csCodeAssembler.addExpression("}");
    }

    @Override
    public void enterWhile_stmt(Python_grammarParser.While_stmtContext ctx) { csCodeAssembler.addExpression("while (" + ctx.expr_bool().getText() + ") {"); }

    @Override
    public void exitWhile_stmt(Python_grammarParser.While_stmtContext ctx) { csCodeAssembler.addExpression("}"); }


    @Override
    public void enterFor_stmt(Python_grammarParser.For_stmtContext ctx) {
        csCodeAssembler.addExpression("foreach (int " + ctx.VAR().get(0) + " in "+ ctx.VAR().get(1) +") {");}

    @Override
    public void exitFor_stmt(Python_grammarParser.For_stmtContext ctx) { csCodeAssembler.addExpression("}"); }


    @Override
    public void enterPrint_stmt(Python_grammarParser.Print_stmtContext ctx) {
        csCodeAssembler.addExpression("Console.WriteLine("+ ctx.expr().getText()+");");
    }


//    private int testDepth = 0;
//    private StringBuilder test = new StringBuilder();
//
//    @Override
//    public void enterNot_test(Python_grammarParser.Not_testContext ctx) {
//        testDepth++;
//
//        String var = "";
//        if (ctx.not_test() != null)
//            var += ctx.not_test();
//        else
//            var += ctx.comparison();
//
//        test.append("!").append(var);
//    }
//
//    @Override
//    public void exitNot_test(Python_grammarParser.Not_testContext ctx) {
//        testDepth--;
//
//        if (testDepth-- == 0)
//
//    }
//
//    @Override
//    public void enterAnd_test(Python_grammarParser.And_testContext ctx) {
//        csCodeAssembler.addExpression(ctx.not_test());
//    }
//
//    @Override
//    public void exitAnd_test(Python_grammarParser.And_testContext ctx) {
//        csCodeAssembler.addExpression();
//    }
}
