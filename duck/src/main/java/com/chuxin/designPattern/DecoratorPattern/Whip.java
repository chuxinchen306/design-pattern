package com.chuxin.designPattern.DecoratorPattern;

public class Whip extends CondimentDecorator{
    Bevarage bevarage;
    public Whip(Bevarage bevarage){
        this.bevarage = bevarage;
    }
    @Override
    public double cost() {
        return bevarage.cost()+5;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+",whip";
    }
}
