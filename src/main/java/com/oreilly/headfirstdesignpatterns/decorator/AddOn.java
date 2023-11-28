package com.oreilly.headfirstdesignpatterns.decorator;

public abstract class AddOn extends Beverage {

    protected Beverage beverage;

    protected AddOn(double cost, String description, Beverage beverage) {
        super(cost, description);
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return cost + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return String.format("%s + %s", beverage.getDescription(), description);
    }
}
