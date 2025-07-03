package com.eljms;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void execute() {
        System.out.println("Default strategy selected.");
    }
}
