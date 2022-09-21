package me.easytodo.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after.DefaultShipFactory;
import me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after.WhiteShip;
import me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;

public class EasytodoFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public EasytodoFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
