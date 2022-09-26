package me.easytodo.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

import me.easytodo.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

/**
 * 빌더를 통해서 메시지 체이닝을 할수있다.
 */
public interface TourPlanBuilder {

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
