package com.example.design.creational_pattern.abstract_factory;

public class IPhoneOrderFactory {
    private IPhonePartsFactory iPhonePartsFactory;

    public IPhoneOrderFactory(IPhonePartsFactory iPhonePartsFactory) {
        this.iPhonePartsFactory = iPhonePartsFactory;
    }

    public IPhone createIPone(){
        IPhone iPhone = new IPhone();
        iPhone.setCamera(iPhonePartsFactory.createCamera());
        iPhone.setChip(iPhonePartsFactory.createChip());
        return iPhone;
    }
}
