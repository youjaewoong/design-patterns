package me.easytodo.designpatterns._03_behavioral_patterns._19_observer._03_java;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * spring application 실행 시 자동 실행
 */
@Component
public class MyRunner implements ApplicationRunner {

	// 발행자
    private ApplicationEventPublisher publisher;

    public MyRunner(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
      
    	// 이벤트 발생
    	publisher.publishEvent(new MyEvent("hello spring event"));
    }
}
