package me.easytodo.designpatterns._03_behavioral_patterns._22_template._02_after;

public class Plus extends FileProcessor {
	
    public Plus(String path) {
		super(path);
	}

	@Override
    public int getResult(int result, int number) {
        return result += number;
    }
}
