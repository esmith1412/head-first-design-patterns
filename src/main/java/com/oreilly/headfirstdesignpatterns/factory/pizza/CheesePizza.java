package com.oreilly.headfirstdesignpatterns.factory.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.printf( "Preparing %s...\n", type.getName() );
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
