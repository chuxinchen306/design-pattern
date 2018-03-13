package com.chuxin.designPattern.DecoratorPattern;

public class Soy extends CondimentDecorator{
    Bevarage bevarage;
    public Soy(Bevarage bevarage){
        this.bevarage = bevarage;
    }
    @Override
    public double cost() {
        return bevarage.cost()+4;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+",Soy";
    }
}
