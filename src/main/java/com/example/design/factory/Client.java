package com.example.design.factory;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "WhiteShip", "juno@mail.com");
        client.print(new BlackShipFactory(), "BlackShip", "juno@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name, email));
    }
}
