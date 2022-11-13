package com.example.design.factory.v1;

public class GV80Factory {

    public static Car createCar(String owner, String color){
        // validate
        if(owner.isEmpty()) throw new IllegalArgumentException("소유자를 입력해주세요.");
        if(color.isEmpty()) throw new IllegalArgumentException("생삭을 입력해주세요.");

        System.out.println("GV80 생산을 시작합니다.");
        Car car = new Car();
        car.setOwner(owner);

        System.out.println("GV80 생산중...");
        car.setEngine("v1+");
        car.setColor(color);
        car.setLogo("제네시스");
        car.setName("GV80");

        System.out.println("GV80을 만드는데 성공했습니다.");

        return car;
    }
}
