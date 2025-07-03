package com.eljms;

public class StrategyImpl1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("Strategy 1 selected.");
    }
}
