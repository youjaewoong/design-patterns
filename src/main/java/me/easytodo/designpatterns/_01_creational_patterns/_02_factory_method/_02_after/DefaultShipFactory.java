package me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after;

public abstract class DefaultShipFactory implements ShipFactory {

	/**
	 * 공통 로직 처리
	 */
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}
