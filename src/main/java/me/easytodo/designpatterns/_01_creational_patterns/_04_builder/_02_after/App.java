package me.easytodo.designpatterns._01_creational_patterns._04_builder._02_after;

import me.easytodo.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

/**
 * 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법
 * (복잡한) 객체를 만드는 프로세스를 독립적으로 분리할 수 있다
 */
public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
