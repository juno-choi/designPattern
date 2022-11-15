package com.example.design.abstract_factory;

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
