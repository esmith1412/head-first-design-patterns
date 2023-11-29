package com.oreilly.headfirstdesignpatterns.factory.pizza.ingredient;

import com.oreilly.headfirstdesignpatterns.factory.pizza.ingredient.topping.*;

import java.util.Collection;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Collection<Meat> createMeats();
    Collection<Fruit> createFruits();
    Collection<Cheese> createCheeses();
    Collection<Vegetable> createVegetables();
}
