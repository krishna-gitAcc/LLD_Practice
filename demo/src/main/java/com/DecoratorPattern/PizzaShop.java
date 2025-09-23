package com.DecoratorPattern;

import com.DecoratorPattern.BaseClass.BasePizza;
import com.DecoratorPattern.BaseClass.Margherita;
import com.DecoratorPattern.Decorator.ExtraCheese;

public class PizzaShop {
    public static void main(String[] args) {
        BasePizza margarita = new Margherita();
        BasePizza margaritaWithCheese = new ExtraCheese(margarita);
        System.out.println(margaritaWithCheese.getCost());
    }

}
