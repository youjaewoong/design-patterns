package me.easytodo.designpatterns._01_creational_patterns._02_factory_method._03_java;

import me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after.Blackship;
import me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after.WhiteShip;

/**
 * SimpleFactory partten
 */
public class SimpleFactory {
    public Object createProduct(String name) {
        if (name.equals("easytodo")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }
        throw new IllegalArgumentException();
    }
}
