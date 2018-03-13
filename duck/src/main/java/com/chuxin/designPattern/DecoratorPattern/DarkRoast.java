package com.chuxin.designPattern.DecoratorPattern;

public class DarkRoast extends Bevarage {
    public DarkRoast(){
        setDescription("DarkRoast");
    }
    @Override
    public double cost() {
        return 20;
    }
}
