package com.example.design.factory;

public class Car {
    private String owner;
    private String name;
    private String color;
    private String logo;
    private String engine;

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getLogo() {
        return logo;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
