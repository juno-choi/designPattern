package com.example.design.creational_pattern.abstract_factory;

public interface IPhonePartsFactory {
    Chip createChip();
    Camera createCamera();
}
