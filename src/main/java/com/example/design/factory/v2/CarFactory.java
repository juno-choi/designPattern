package com.example.design.factory.v2;

import com.example.design.factory.Car;

public interface CarFactory {
    default Car orderCar(String owner, String color){
        validate(owner, color);
        Car car = createCar();
        prepare(car);
        settingCar(car, owner, color);
        complete(car);
        return car;
    }

    private void validate(String owner, String color){
        if(owner.isEmpty()) throw new IllegalArgumentException("소유자를 입력해주세요.");
        if(color.isEmpty()) throw new IllegalArgumentException("색상을 입력해주세요.");
    }

    private void prepare(Car car){
        System.out.println(car.getName()+" 생산을 시작합니다.");
        System.out.println(car.getName()+" 생산중...");
    }

    private void settingCar(Car car, String owner, String color){
        car.setOwner(owner);
        car.setColor(color);
    }

    private void complete(Car car){
        System.out.println(car.getName()+"을 만드는데 성공했습니다.");
    }

    // 구현해야하는 부분
    Car createCar();
}
