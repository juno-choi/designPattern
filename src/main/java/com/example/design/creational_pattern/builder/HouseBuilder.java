package com.example.design.creational_pattern.builder;

public interface HouseBuilder {
    HouseBuilder elevator(String elevator);
    HouseBuilder window(String window);
    HouseBuilder park(String park);
    HouseBuilder room(int room);
    HouseBuilder parking(Boolean parking);
    House build();
}
