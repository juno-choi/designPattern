package com.example.design.creational_pattern.abstract_factory;

public class IPhonePlusFactory implements IPhonePartsFactory{
    @Override
    public Chip createChip() {
        return new PlusChip();
    }

    @Override
    public Camera createCamera() {
        return new PlusCamera();
    }
}
