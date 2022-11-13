package com.example.design.factory.v2;

import com.example.design.factory.Car;

public class GV80FactoryV2 implements CarFactory{
    @Override
    public Car createCar() {
        return new GV80V2();
    }
}
