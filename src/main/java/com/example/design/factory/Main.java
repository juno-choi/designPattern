package com.example.design.factory;

import com.example.design.factory.v1.Car;
import com.example.design.factory.v1.AvanteFactory;
import com.example.design.factory.v1.GV80Factory;

public class Main {
    public static void main(String[] args) {
        Car car1 = AvanteFactory.createCar("최준호", "white");
        Car car2 = GV80Factory.createCar("최준호", "black");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
