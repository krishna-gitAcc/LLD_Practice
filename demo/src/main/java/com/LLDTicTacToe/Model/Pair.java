package com.LLDTicTacToe.Model;

public class Pair<T1, T2> {
    public T1 value1;
    public T2 value2;

    public Pair(T1 v1, T2 v2){
        value1 = v1;
        value2 = v2;
    }

    public T1 first(){
        return value1;
    }

    public T2 second(){
        return value2;
    }
}
