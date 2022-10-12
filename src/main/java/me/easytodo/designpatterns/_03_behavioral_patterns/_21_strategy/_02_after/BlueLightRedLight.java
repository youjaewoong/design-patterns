package me.easytodo.designpatterns._03_behavioral_patterns._21_strategy._02_after;

// delegate
public class BlueLightRedLight {

    public void blueLight(Speed speed) {
        speed.blueLight();
    }

    public void redLight(Speed speed) {
        speed.redLight();
    }
}
