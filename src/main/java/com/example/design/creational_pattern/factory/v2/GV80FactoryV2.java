package com.example.design.creational_pattern.factory.v2;

import com.example.design.creational_pattern.factory.Car;

public class GV80FactoryV2 implements CarFactory{
    @Override
    public Car createCar() {
        return new GV80V2();
    }
}
