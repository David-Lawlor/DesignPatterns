package StrategyPattern.model;

import StrategyPattern.Behaviours.Fly.FlyWithWings;
import StrategyPattern.Behaviours.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
