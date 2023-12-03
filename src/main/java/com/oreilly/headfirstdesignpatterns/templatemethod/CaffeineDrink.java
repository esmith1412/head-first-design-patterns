package com.oreilly.headfirstdesignpatterns.templatemethod;

public abstract class CaffeineDrink {

    public abstract void brew();
    public abstract void addCondiments();

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {

    }

    public void pourInCup() {

    }
}
