package me.easytodo.designpatterns._03_behavioral_patterns._19_observer._02_after;

//concrrent observer
public class User implements Subscriber {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }
}
