package me.easytodo.designpatterns._03_behavioral_patterns._15_interpreter._02_after;

import java.util.Map;

/**
 * 자주 등장하는 문제를 간단한 언어로 정의하고 재사용하는 패턴.
 * 반복되는 문제 패턴을 언어 또는 문법으로 정의하고 확장할 수 있다
 * 요청을 캡슐화 하여 호출자(invoker)와 수신자(receiver)를 분리하는 패턴.
 * 
 * 장점
 * - 자주 등장하는 문제 패턴을 언어와 문법으로 정의할 수 있다.
 * - 기존 코드를 변경하지 않고 새로운 Expression을 추가할 수 있다.
 * 단점
 * - 복잡한 문법을 표현하려면 Expression과 Parser가 복잡해진다.
 * 
 * 1) PostfixExpression expresiion 인터페이스 생성
 * - VariableExpression 구현체
 * - PlusExpression 구현체
 * - MinusExpression 구현체
 * - 
 * 2) PostfixParser 비즈니스로직 처리 
 */
public class App {

    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-a+");
        
        // context
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4));
        System.out.println(result);
    }
}
