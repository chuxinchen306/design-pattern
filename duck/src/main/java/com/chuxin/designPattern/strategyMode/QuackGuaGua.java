package com.chuxin.designPattern.strategyMode;

public class QuackGuaGua implements QuackBehavior{
    @Override
    public void quack() {
        System.out.print("guagua");
    }
}
