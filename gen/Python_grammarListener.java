// Generated from E:/Programming/python_to_cs_converter\Python_grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Python_grammarParser}.
 */
public interface Python_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Python_grammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Python_grammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Python_grammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Python_grammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(Python_grammarParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(Python_grammarParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(Python_grammarParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(Python_grammarParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(Python_grammarParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(Python_grammarParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(Python_grammarParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(Python_grammarParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(Python_grammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(Python_grammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElif_stmt(Python_grammarParser.Elif_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElif_stmt(Python_grammarParser.Elif_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(Python_grammarParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(Python_grammarParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(Python_grammarParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(Python_grammarParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(Python_grammarParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(Python_grammarParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Python_grammarParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Python_grammarParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Python_grammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Python_grammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Python_grammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Python_grammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(Python_grammarParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(Python_grammarParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#func_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_name(Python_grammarParser.Func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#func_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_name(Python_grammarParser.Func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(Python_grammarParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(Python_grammarParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#func_ret}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ret(Python_grammarParser.Func_retContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#func_ret}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ret(Python_grammarParser.Func_retContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#func_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args(Python_grammarParser.Func_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#func_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args(Python_grammarParser.Func_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#func_invoke_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_invoke_args(Python_grammarParser.Func_invoke_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#func_invoke_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_invoke_args(Python_grammarParser.Func_invoke_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(Python_grammarParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(Python_grammarParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(Python_grammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(Python_grammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Python_grammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Python_grammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#expr_bool}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool(Python_grammarParser.Expr_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#expr_bool}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool(Python_grammarParser.Expr_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(Python_grammarParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(Python_grammarParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(Python_grammarParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(Python_grammarParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(Python_grammarParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(Python_grammarParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(Python_grammarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(Python_grammarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python_grammarParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(Python_grammarParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python_grammarParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(Python_grammarParser.Comp_opContext ctx);
}