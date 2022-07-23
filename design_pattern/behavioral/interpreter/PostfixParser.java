package design_pattern.behavioral.interpreter;

import java.util.Stack;

public class PostfixParser {
    
    public static PostfixExpression parse(String expression) {
        
        Stack<PostfixExpression> stack = new Stack<>();
        
        for(char c : expression.toCharArray()) stack.push(getExpression(c, stack));
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch(c) {
            case '+': return new PlusExpression(stack.pop(), stack.pop());
            case '-': return new MinusExpression(stack.pop(), stack.pop());
            case '*': return new MultiplyExpression(stack.pop(), stack.pop());
            case '/': return new DivisionExpression(stack.pop(), stack.pop());
            default: return new VariableExpression(c);
        }
    }
}
