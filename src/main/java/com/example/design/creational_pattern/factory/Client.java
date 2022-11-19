package com.example.design.creational_pattern.factory;

import com.example.design.creational_pattern.factory.v2.AvanteFactoryV2;
import com.example.design.creational_pattern.factory.v2.CarFactory;
import com.example.design.creational_pattern.factory.v2.GV80FactoryV2;

public class Client {
    public static void main(String[] args) {
        order(new AvanteFactoryV2(), "최준호", "white");
        order(new GV80FactoryV2(), "최준호", "black");
    }
    private static void order(CarFactory carFactory, String owner, String color){
        Car car = carFactory.orderCar(owner, color);
        System.out.println(car.toString());
    }
}
