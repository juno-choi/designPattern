package com.example.design.factory;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("WhiteShip", "juno@mail.com");
        System.out.println(whiteship);
    }

}
