package me.easytodo.designpatterns._01_creational_patterns._02_factory_method._01_before;

public class Client {

    public static void main(String[] args) {
        Ship easytodo = ShipFactory.orderShip("easytodo", "nnv711@gmail.com");
        System.out.println(easytodo);

        Ship blackship = ShipFactory.orderShip("Blackship", "nnv711@gmail.com");
        System.out.println(blackship);
    }

}
