package design_pattern.behavioral.interpreter;

import java.util.Map;

public class DivisionExpression implements PostfixExpression {

    private PostfixExpression left;
    private PostfixExpression right;

    public DivisionExpression(PostfixExpression right, PostfixExpression left) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) / right.interpret(context);
    }
    
}
