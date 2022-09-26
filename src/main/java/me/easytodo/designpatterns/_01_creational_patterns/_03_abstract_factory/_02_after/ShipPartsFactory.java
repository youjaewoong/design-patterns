package me.easytodo.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

//선박부품
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
