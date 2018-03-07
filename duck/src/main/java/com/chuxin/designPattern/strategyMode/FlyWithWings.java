package com.chuxin.designPattern.strategyMode;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("flyWithWings");
        //implements fly with wing
    }
}
