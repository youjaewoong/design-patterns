package me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class WhiteShipFactory extends DefaultShipFactory {

	/**
	 * 확장클래스 처리
	 */
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
