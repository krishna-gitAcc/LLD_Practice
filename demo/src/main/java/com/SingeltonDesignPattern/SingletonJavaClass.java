package com.SingeltonDesignPattern;

public class SingletonJavaClass {
    private static volatile SingletonJavaClass instance;

    public static synchronized SingletonJavaClass getInstance(){
        if(instance == null){
            synchronized (SingletonJavaClass.class){ //multiple thread can reach here and will be waiting for the lock over the class.
                // once the lock is release by one thread other thread will acquire this lock and try to create obj of the singletonClass.
                //that's why we need the check for null here as well.
                if(instance == null){
                        instance = new SingletonJavaClass();
                }
            }
        }
        return instance;
    }

    private SingletonJavaClass(){
        System.out.println("Singleton Class is initialized.");
    }

    public void doSomething(){
        System.out.println("We are doing something using this instance.");
    }
}
