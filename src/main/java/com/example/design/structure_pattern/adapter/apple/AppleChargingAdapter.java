package com.example.design.structure_pattern.adapter.apple;

import com.example.design.structure_pattern.adapter.samsung.SamsungCharging;

public class AppleChargingAdapter implements SamsungCharging {
    private AppleCharging appleCharging;

    public AppleChargingAdapter(AppleCharging appleCharging) {
        this.appleCharging = appleCharging;
    }

    @Override
    public void samsungCharging() {
        appleCharging.appleCharging();
    }
}
