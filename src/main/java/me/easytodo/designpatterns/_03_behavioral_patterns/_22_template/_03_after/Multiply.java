package me.easytodo.designpatterns._03_behavioral_patterns._22_template._03_after;

public class Multiply implements Operator {
	
    @Override
	public int getResult(int result, int number) {
        return result *= number;
    }
    
}
