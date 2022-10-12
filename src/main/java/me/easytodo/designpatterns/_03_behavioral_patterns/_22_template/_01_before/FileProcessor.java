package me.easytodo.designpatterns._03_behavioral_patterns._22_template._01_before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    private String path;
    public FileProcessor(String path) {
        this.path = path;
    }

    public int process() {
    	// close를 해주지 않아도 자동 close 해준다. try (...)
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while((line = reader.readLine()) != null) {
            	// Integer.valueOf 는 Integer return
            	// Integer.parseInt 는 Int return
                result += Integer.parseInt(line );
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
}
