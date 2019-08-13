// Generated from program.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link programParser}.
 */
public interface programListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link programParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(programParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(programParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(programParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(programParser.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(programParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(programParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignOperation}
	 * labeled alternative in {@link programParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperation(programParser.AssignOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignOperation}
	 * labeled alternative in {@link programParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperation(programParser.AssignOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignImage}
	 * labeled alternative in {@link programParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignImage(programParser.AssignImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignImage}
	 * labeled alternative in {@link programParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignImage(programParser.AssignImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignVar}
	 * labeled alternative in {@link programParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(programParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignVar}
	 * labeled alternative in {@link programParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(programParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showImage}
	 * labeled alternative in {@link programParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShowImage(programParser.ShowImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showImage}
	 * labeled alternative in {@link programParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShowImage(programParser.ShowImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showVar}
	 * labeled alternative in {@link programParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShowVar(programParser.ShowVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showVar}
	 * labeled alternative in {@link programParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShowVar(programParser.ShowVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resizeImage}
	 * labeled alternative in {@link programParser#resize}.
	 * @param ctx the parse tree
	 */
	void enterResizeImage(programParser.ResizeImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resizeImage}
	 * labeled alternative in {@link programParser#resize}.
	 * @param ctx the parse tree
	 */
	void exitResizeImage(programParser.ResizeImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resizeVar}
	 * labeled alternative in {@link programParser#resize}.
	 * @param ctx the parse tree
	 */
	void enterResizeVar(programParser.ResizeVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resizeVar}
	 * labeled alternative in {@link programParser#resize}.
	 * @param ctx the parse tree
	 */
	void exitResizeVar(programParser.ResizeVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rotateImage}
	 * labeled alternative in {@link programParser#rotate}.
	 * @param ctx the parse tree
	 */
	void enterRotateImage(programParser.RotateImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rotateImage}
	 * labeled alternative in {@link programParser#rotate}.
	 * @param ctx the parse tree
	 */
	void exitRotateImage(programParser.RotateImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rotateVar}
	 * labeled alternative in {@link programParser#rotate}.
	 * @param ctx the parse tree
	 */
	void enterRotateVar(programParser.RotateVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rotateVar}
	 * labeled alternative in {@link programParser#rotate}.
	 * @param ctx the parse tree
	 */
	void exitRotateVar(programParser.RotateVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cannyImage}
	 * labeled alternative in {@link programParser#canny}.
	 * @param ctx the parse tree
	 */
	void enterCannyImage(programParser.CannyImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cannyImage}
	 * labeled alternative in {@link programParser#canny}.
	 * @param ctx the parse tree
	 */
	void exitCannyImage(programParser.CannyImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cannyVar}
	 * labeled alternative in {@link programParser#canny}.
	 * @param ctx the parse tree
	 */
	void enterCannyVar(programParser.CannyVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cannyVar}
	 * labeled alternative in {@link programParser#canny}.
	 * @param ctx the parse tree
	 */
	void exitCannyVar(programParser.CannyVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blurImage}
	 * labeled alternative in {@link programParser#blur}.
	 * @param ctx the parse tree
	 */
	void enterBlurImage(programParser.BlurImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blurImage}
	 * labeled alternative in {@link programParser#blur}.
	 * @param ctx the parse tree
	 */
	void exitBlurImage(programParser.BlurImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blurVar}
	 * labeled alternative in {@link programParser#blur}.
	 * @param ctx the parse tree
	 */
	void enterBlurVar(programParser.BlurVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blurVar}
	 * labeled alternative in {@link programParser#blur}.
	 * @param ctx the parse tree
	 */
	void exitBlurVar(programParser.BlurVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blendImage}
	 * labeled alternative in {@link programParser#blend}.
	 * @param ctx the parse tree
	 */
	void enterBlendImage(programParser.BlendImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blendImage}
	 * labeled alternative in {@link programParser#blend}.
	 * @param ctx the parse tree
	 */
	void exitBlendImage(programParser.BlendImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blendImageVar}
	 * labeled alternative in {@link programParser#blend}.
	 * @param ctx the parse tree
	 */
	void enterBlendImageVar(programParser.BlendImageVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blendImageVar}
	 * labeled alternative in {@link programParser#blend}.
	 * @param ctx the parse tree
	 */
	void exitBlendImageVar(programParser.BlendImageVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blendVarImage}
	 * labeled alternative in {@link programParser#blend}.
	 * @param ctx the parse tree
	 */
	void enterBlendVarImage(programParser.BlendVarImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blendVarImage}
	 * labeled alternative in {@link programParser#blend}.
	 * @param ctx the parse tree
	 */
	void exitBlendVarImage(programParser.BlendVarImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blendVar}
	 * labeled alternative in {@link programParser#blend}.
	 * @param ctx the parse tree
	 */
	void enterBlendVar(programParser.BlendVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blendVar}
	 * labeled alternative in {@link programParser#blend}.
	 * @param ctx the parse tree
	 */
	void exitBlendVar(programParser.BlendVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code saveImage}
	 * labeled alternative in {@link programParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSaveImage(programParser.SaveImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code saveImage}
	 * labeled alternative in {@link programParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSaveImage(programParser.SaveImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code saveVar}
	 * labeled alternative in {@link programParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSaveVar(programParser.SaveVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code saveVar}
	 * labeled alternative in {@link programParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSaveVar(programParser.SaveVarContext ctx);
}