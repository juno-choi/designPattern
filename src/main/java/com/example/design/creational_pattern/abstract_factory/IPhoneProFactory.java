package com.example.design.creational_pattern.abstract_factory;

public class IPhoneProFactory implements IPhonePartsFactory{
    @Override
    public Chip createChip() {
        return new ProChip();
    }

    @Override
    public Camera createCamera() {
        return new ProCamera();
    }
}
