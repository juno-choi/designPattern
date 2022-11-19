package com.example.design.creational_pattern.builder;

public class ApartBuilder {
    private HouseBuilder houseBuilder;

    public ApartBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House prugio(){
        return houseBuilder
                .elevator("대우")
                .window("고급 창문")
                .room(500)
                .park("대우 공원")
                .parking(true)
                .build();
    }

    public House xi(){
        return houseBuilder
                .elevator("GS")
                .window("고급 창문")
                .room(500)
                .park("자이 공원")
                .parking(true)
                .build();
    }
}
