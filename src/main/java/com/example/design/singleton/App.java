package com.example.design.singleton;

public class App {
    public static void main(String[] args) {
        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = Settings.INSTANCE;

        System.out.println(settings1 == settings2);
    }
}
