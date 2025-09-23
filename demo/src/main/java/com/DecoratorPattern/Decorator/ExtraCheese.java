package com.DecoratorPattern.Decorator;

import com.DecoratorPattern.BaseClass.BasePizza;

public class ExtraCheese extends  ToppingInterface {

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getCost(){
        return basePizza.getCost() + 10;
    }
}
