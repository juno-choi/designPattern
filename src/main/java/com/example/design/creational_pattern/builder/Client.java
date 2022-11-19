package com.example.design.creational_pattern.builder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder builder = new DefaultHouseBuilder();
        ApartBuilder apartBuilder = new ApartBuilder(builder);
        House prugio = apartBuilder.prugio();
        House xi = apartBuilder.xi();

        System.out.println(prugio.toString());
        System.out.println(xi.toString());
    }
}
