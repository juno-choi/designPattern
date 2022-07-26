package com.example.design.factory;

public class BlackShipFactory implements ShipFactory{
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
