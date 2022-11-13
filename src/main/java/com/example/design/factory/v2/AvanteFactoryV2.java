package com.example.design.factory.v2;

public class AvanteFactoryV2 implements CarFactory{
    @Override
    public AvanteV2 createCar() {
        return new AvanteV2();
    }
}
