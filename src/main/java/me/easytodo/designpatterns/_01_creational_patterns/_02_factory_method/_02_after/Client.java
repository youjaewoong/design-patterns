package me.easytodo.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new EasytodoFactory(), "easytodo", "nnv711@gmail.com");
        client.print(new BlackshipFactory(), "blackship", "nnv711@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
