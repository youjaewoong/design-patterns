package me.easytodo.designpatterns._03_behavioral_patterns._19_observer._03_java;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    @EventListener(MyEvent.class)
    public void onApplicationEvent1(MyEvent event) {
        System.out.println("첫번째 ::" + event.getMessage());
    }
    
    
    @EventListener(MyEvent.class)
    public void onApplicationEvent2(MyEvent event) {
        System.out.println("두번째 ::" + event.getMessage());
    }
}
