package com.example.design.abstract_factory;

public class Client {
    public static void main(String[] args) {
        IPhoneOrderFactory iPhoneOrderFactory1 = new IPhoneOrderFactory(new IPhonePlusFactory());
        IPhoneOrderFactory iPhoneOrderFactory2 = new IPhoneOrderFactory(new IPhoneProFactory());
        IPhoneOrderFactory iPhoneOrderFactory3 = new IPhoneOrderFactory(new IPhoneProMaxFactory());

        IPhone iPhone1 = iPhoneOrderFactory1.createIPone();
        IPhone iPhone2 = iPhoneOrderFactory2.createIPone();
        IPhone iPhone3 = iPhoneOrderFactory3.createIPone();

        System.out.println(iPhone1.getCamera().getClass());
        System.out.println(iPhone1.getChip().getClass());

        System.out.println(iPhone2.getCamera().getClass());
        System.out.println(iPhone2.getChip().getClass());

        System.out.println(iPhone3.getCamera().getClass());
        System.out.println(iPhone3.getChip().getClass());

        System.out.println("-------------------------");

        System.out.println(iPhone1.getCamera().name());
        System.out.println(iPhone1.getChip().name());

        System.out.println(iPhone2.getCamera().name());
        System.out.println(iPhone2.getChip().name());

        System.out.println(iPhone3.getCamera().name());
        System.out.println(iPhone3.getChip().name());
    }
}
