package com.example.design.factory;

public class WhiteShipFactory implements ShipFactory{

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
