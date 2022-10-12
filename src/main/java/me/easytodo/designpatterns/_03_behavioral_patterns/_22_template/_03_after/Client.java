package me.easytodo.designpatterns._03_behavioral_patterns._22_template._03_after;


/**
 * template call back
 */
public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        
        int result = fileProcessor.process((sum, number) -> sum += number);
        System.out.println(result);
    }
}
