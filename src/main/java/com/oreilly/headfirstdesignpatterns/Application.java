package com.oreilly.headfirstdesignpatterns;

import com.oreilly.headfirstdesignpatterns.decorator.Beverage;
import com.oreilly.headfirstdesignpatterns.decorator.HouseBlend;
import com.oreilly.headfirstdesignpatterns.decorator.Soy;
import com.oreilly.headfirstdesignpatterns.decorator.SteamedMilk;

public class Application {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new SteamedMilk(beverage);
        beverage = new Soy(beverage);

        System.out.printf( "Beverage description: %s\n", beverage.getDescription() );
        System.out.printf( "Beverage cost: %s\n", beverage.getCost() );
    }
}
