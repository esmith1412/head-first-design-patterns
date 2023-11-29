package com.oreilly.headfirstdesignpatterns.factory.pizza;

import com.oreilly.headfirstdesignpatterns.factory.pizza.ingredient.Dough;
import com.oreilly.headfirstdesignpatterns.factory.pizza.ingredient.Sauce;
import com.oreilly.headfirstdesignpatterns.factory.pizza.ingredient.topping.Topping;
import com.oreilly.headfirstdesignpatterns.factory.pizza.ingredient.PizzaIngredientFactory;

import lombok.Data;

import java.util.Collection;

@Data
public abstract class Pizza {

    protected PizzaType type;
    protected Dough dough;
    protected Sauce sauce;
    protected PizzaIngredientFactory ingredientFactory;
    protected Collection<Topping> toppings;

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
