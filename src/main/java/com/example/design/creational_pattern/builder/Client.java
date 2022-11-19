package com.example.design.creational_pattern.builder;

public class Client {
    public static void main(String[] args) {
        House apartment = new House();
        apartment.setElevator("현대");
        apartment.setWindow("고급 창문");
        apartment.setPark("호수 공원");
        apartment.setParking(true);
        apartment.setRoom(500);

        House building = new House();
        building.setParking(false);
        building.setRoom(10);
        building.setWindow("일반 창문");

        System.out.println(apartment.toString());
        System.out.println(building.toString());
    }
}
