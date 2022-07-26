package com.example.design.abstract_factory;

public class WhiteShipProPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteShipProAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteShipProWheel();
    }
}
