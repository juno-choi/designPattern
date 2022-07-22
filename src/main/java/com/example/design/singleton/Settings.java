package com.example.design.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings(){}

    private static class SettingHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static synchronized Settings getInstance(){
        return SettingHolder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }
}
