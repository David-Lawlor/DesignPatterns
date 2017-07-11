package StrategyPattern.main;

import StrategyPattern.Behaviours.Fly.FlyRocketPowered;
import StrategyPattern.model.Duck;
import StrategyPattern.model.MallardDuck;
import StrategyPattern.model.ModelDuck;

public class PatternTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}

