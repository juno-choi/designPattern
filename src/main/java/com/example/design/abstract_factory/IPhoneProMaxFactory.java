package com.example.design.abstract_factory;

public class IPhoneProMaxFactory implements IPhonePartsFactory{
    @Override
    public Chip createChip() {
        return new ProMaxChip();
    }

    @Override
    public Camera createCamera() {
        return new ProMaxCamera();
    }
}
