package com.example.design.abstract_factory;

public interface IPhonePartsFactory {
    Chip createChip();
    Camera createCamera();
}
