package com.chuxin.designPattern.strategyMode;

public class QuackZhiZhi implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("zhizhi");
    }
}
