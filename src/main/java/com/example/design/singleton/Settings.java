package com.example.design.singleton;

public class Settings {

    private static final Settings INSTANCE = new Settings();

    private Settings(){}

    public static synchronized Settings getInstance(){
        return INSTANCE;
    }
}
