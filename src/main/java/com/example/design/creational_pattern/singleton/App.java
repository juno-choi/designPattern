package com.example.design.creational_pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Car car1 = Car.INSTANCE;
        Car car2 = Car.INSTANCE;
        Constructor<?>[] declaredConstructors = Car.class.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            declaredConstructor.setAccessible(true);
            car2 = (Car) declaredConstructor.newInstance();
        }
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1 == car2);
    }
}
