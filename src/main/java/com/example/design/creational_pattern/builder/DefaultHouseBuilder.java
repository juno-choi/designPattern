package com.example.design.creational_pattern.builder;

public class DefaultHouseBuilder implements HouseBuilder{
    private String elevator;
    private String window;
    private String park;
    private int room;
    private Boolean parking;

    @Override
    public HouseBuilder elevator(String elevator) {
        this.elevator = elevator;
        return this;
    }

    @Override
    public HouseBuilder window(String window) {
        this.window = window;
        return this;
    }

    @Override
    public HouseBuilder park(String park) {
        this.park = park;
        return this;
    }

    @Override
    public HouseBuilder room(int room) {
        this.room = room;
        return this;
    }

    @Override
    public HouseBuilder parking(Boolean parking) {
        this.parking = parking;
        return this;
    }

    @Override
    public House build() {
        return new House(elevator, window, park, room, parking);
    }
}
