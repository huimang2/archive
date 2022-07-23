package design_pattern.behavioral.interpreter;

import java.util.Map;

public interface PostfixExpression {
    public int interpret(Map<Character, Integer> context);
}
