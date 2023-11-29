package com.oreilly.headfirstdesignpatterns.factory.pizza;

import com.oreilly.headfirstdesignpatterns.factory.pizza.ingredient.PizzaIngredientFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class PizzaStore {

    protected final PizzaIngredientFactory ingredientFactory;

    public final Pizza orderPizza(PizzaType type) {
        var pizza = createPizza(type);

        pizza.setIngredientFactory(ingredientFactory);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(PizzaType type);
}
