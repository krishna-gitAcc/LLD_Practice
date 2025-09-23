package com.DecoratorPattern.Decorator;

import com.DecoratorPattern.BaseClass.BasePizza;

public class Mashroom extends  ToppingInterface {

    public Mashroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int getCost(){
        return this.basePizza.getCost() + 11;
    }
}
