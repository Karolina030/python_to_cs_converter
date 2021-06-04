// Generated from /Users/karolinamatuszczyk/projekt_kompilatory/Python_grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Python_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Python_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Python_grammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(Python_grammarParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#simple_stmt_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt_line(Python_grammarParser.Simple_stmt_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(Python_grammarParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(Python_grammarParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(Python_grammarParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(Python_grammarParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#elif_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_stmt(Python_grammarParser.Elif_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stmt(Python_grammarParser.Else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(Python_grammarParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(Python_grammarParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(Python_grammarParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Python_grammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Python_grammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(Python_grammarParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(Python_grammarParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(Python_grammarParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#func_ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ret(Python_grammarParser.Func_retContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(Python_grammarParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#func_invoke_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_invoke_args(Python_grammarParser.Func_invoke_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(Python_grammarParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Python_grammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Python_grammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#expr_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool(Python_grammarParser.Expr_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(Python_grammarParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(Python_grammarParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(Python_grammarParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(Python_grammarParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python_grammarParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(Python_grammarParser.Comp_opContext ctx);
}