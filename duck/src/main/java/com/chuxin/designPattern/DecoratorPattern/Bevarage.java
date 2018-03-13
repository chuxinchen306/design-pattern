package com.chuxin.designPattern.DecoratorPattern;

public abstract class Bevarage {
    private String description;

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
