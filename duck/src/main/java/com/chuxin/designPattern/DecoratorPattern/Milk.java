package com.chuxin.designPattern.DecoratorPattern;

public class Milk extends CondimentDecorator{
    Bevarage bevarage;
    public Milk(Bevarage bevarage){
        this.bevarage = bevarage;
    }
    @Override
    public double cost() {
        return bevarage.cost()+2;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+",milk";
    }
}
