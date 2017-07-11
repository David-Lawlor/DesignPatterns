package StrategyPattern.Behaviours.Quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<...>");
    }
}
