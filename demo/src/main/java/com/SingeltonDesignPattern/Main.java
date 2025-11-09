package com.SingeltonDesignPattern;

public class Main {
//    SingletonJavaClass obj1 = SingletonJavaClass()// we can't instanciate the class as it has private constructor
    public static void main(String[] args){
        SingletonJavaClass obj1 = SingletonJavaClass.getInstance();
        SingletonJavaClass obj2 = SingletonJavaClass.getInstance();
        obj1.doSomething();
        obj2.doSomething();
    }
}
