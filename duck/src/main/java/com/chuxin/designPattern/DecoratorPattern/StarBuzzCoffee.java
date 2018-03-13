package com.chuxin.designPattern.DecoratorPattern;

public class StarBuzzCoffee {
    public static void main (String [] args){
        Bevarage bevarage1 = new DarkRoast();
        bevarage1 = new Milk(bevarage1);
        bevarage1 = new Mocha(bevarage1);
        System.out.print(bevarage1.getDescription()+"___"+bevarage1.cost());
    }
}
