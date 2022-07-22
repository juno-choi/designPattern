package com.example.design.singleton;

public class Settings {

    private Settings(){}

    private static class SettingHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static synchronized Settings getInstance(){
        return SettingHolder.INSTANCE;
    }
}
