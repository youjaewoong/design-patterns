package me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class Client {

	/**
	 * 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
	 * 다양한 구현체 (Product)가 있고, 그중에서 특정한 구현체를 만들 수 있는 다양한 팩토리 (Creator)를 제공할 수 있다.
	 * 
	 * factory pattern
	 * 1. 각 팩토리에 생성 요청
	 * 2. WhiteShipFactory 공장에서 처리
	 * 		createShip 생성
	 * 			WhitShip 확장클래스 return
	 * 				Ship 상속
	 * 3. DefaultShipFactory 추상클래스에서 공통 처리
	 * 		sendEmailTo
	 * 4. ShipFactory 각처리 되는 설계도면
	 */
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "nnv711@gmail.com");
        client.print(new BlackshipFactory(), "blackship", "nnv711@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
