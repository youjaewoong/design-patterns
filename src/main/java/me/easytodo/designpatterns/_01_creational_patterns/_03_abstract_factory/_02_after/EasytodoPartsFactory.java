package me.easytodo.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.easytodo.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import me.easytodo.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteWheel;

public class EasytodoPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
