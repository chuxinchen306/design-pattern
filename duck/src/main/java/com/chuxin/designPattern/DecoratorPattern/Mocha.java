package com.chuxin.designPattern.DecoratorPattern;

public class Mocha extends CondimentDecorator {
    Bevarage bevarage;
    public Mocha(Bevarage bevarage){
        this.bevarage = bevarage;
    }
    @Override
    public double cost() {
        return bevarage.cost()+3;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+",Mocha";
    }
}
