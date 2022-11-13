package com.example.design.factory.v1;

public class AvanteFactory {

    public static Car createCar(String owner, String color){
        // validate
        if(owner.isEmpty()) throw new IllegalArgumentException("소유자를 입력해주세요.");
        if(color.isEmpty()) throw new IllegalArgumentException("생삭을 입력해주세요.");

        System.out.println("Avante 생산을 시작합니다.");
        Car car = new Car();
        car.setOwner(owner);

        System.out.println("Avante 생산중...");
        car.setEngine("v1");
        car.setColor(color);
        car.setLogo("현대");
        car.setName("Avante");

        System.out.println("Avante를 만드는데 성공했습니다.");

        return car;
    }
}
