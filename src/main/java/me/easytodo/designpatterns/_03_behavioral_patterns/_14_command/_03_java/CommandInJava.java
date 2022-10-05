package me.easytodo.designpatterns._03_behavioral_patterns._14_command._03_java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import me.easytodo.designpatterns._03_behavioral_patterns._14_command._01_before.Game;
import me.easytodo.designpatterns._03_behavioral_patterns._14_command._01_before.Light;

public class CommandInJava {

    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        //threadPool 4개를 사용한 비동기 처리
        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        executorService.submit(new Runnable() {
//			@Override
//			public void run() {
//				light.on();
//			}
//		});
        executorService.submit(light::on);
        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.submit(light::off);
        executorService.shutdown();
    }
}
