package com.example.design.structure_pattern.adapter;

import com.example.design.structure_pattern.adapter.apple.AppleCharging;
import com.example.design.structure_pattern.adapter.apple.AppleChargingAdapter;
import com.example.design.structure_pattern.adapter.apple.AppleChargingImpl;

public class Client {
    public static void main(String[] args) {
        AppleCharging apple = new AppleChargingImpl();
        AppleChargingAdapter adapter = new AppleChargingAdapter(apple);
        adapter.samsungCharging();
    }
}
