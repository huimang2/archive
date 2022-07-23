package design_pattern.behavioral.interpreter;

import java.util.Map;

public class Client {
    
    public static void main(String[] args) {
        
        PostfixExpression expression = PostfixParser.parse("xyz*+a-");
        
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4));
        
        System.out.println(result);
    }
}
