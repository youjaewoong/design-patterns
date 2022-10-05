package me.easytodo.designpatterns._03_behavioral_patterns._15_interpreter._02_after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);
    
    // interface에서 제공하는 static 구현방법
    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
    	return context -> left.interpret(context) + right.interpret(context);
    }
    
    static PostfixExpression minux(PostfixExpression left, PostfixExpression right) {
    	return context -> left.interpret(context) - right.interpret(context);
    }
    
    static PostfixExpression varibale(Character c) {
    	return context -> context.get(c);
    }

}
