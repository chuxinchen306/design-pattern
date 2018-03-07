package com.chuxin.designPattern.strategyMode;

public class GreenHeadDuck extends Duck {
    public GreenHeadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new QuackGuaGua();
    }

    public static void main(String[] args){
        new GreenHeadDuck().performFly();
        new GreenHeadDuck().performQuack();
    }
}
