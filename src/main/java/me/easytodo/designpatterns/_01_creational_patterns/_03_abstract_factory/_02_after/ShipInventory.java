package me.easytodo.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after.ShipFactory;

/**
 * 서로 관련있는 여러 객체를 만들어주는 인터페이스.
 * 구체적으로 어떤 클래스의 인스턴스를(concrete product)를 사용하는지 감출 수 있다.
 *
 */
public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
