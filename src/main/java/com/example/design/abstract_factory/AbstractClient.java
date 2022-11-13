package com.example.design.abstract_factory;

import com.example.design.factory.Ship;
import com.example.design.factory.ShipFactory;

public class AbstractClient {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();

        System.out.println(ship.getAnchor());
        System.out.println(ship.getWheel());
    }
}
