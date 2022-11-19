package com.example.design.creational_pattern.builder;

public class House {
    private String elevator;
    private String window;
    private String park;
    private int room;
    private Boolean parking;

    public House() {
    }

    public House(String elevator, String window, String park, int room, Boolean parking) {
        this.elevator = elevator;
        this.window = window;
        this.park = park;
        this.room = room;
        this.parking = parking;
    }

    public void setElevator(String elevator) {
        this.elevator = elevator;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    @Override
    public String toString() {
        return "House{" +
                "elevator='" + elevator + '\'' +
                ", window='" + window + '\'' +
                ", park='" + park + '\'' +
                ", room=" + room +
                ", parking=" + parking +
                '}';
    }
}
