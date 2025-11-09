package com.ProducerConsumerProblem;

import java.util.Stack;

public class ProducerConsumer {
    public int capacity;
    Stack<Integer> st;
    public ProducerConsumer(int capacity){
        this.capacity = capacity;
        st = new Stack<>();
    }

    public synchronized void  produce () throws Exception{
        for(int i = 0; i<200; i++){
            if(st.size()==capacity){
                System.out.println("All the resource is full going to sleep status.");
                wait();
            }
            System.out.println("Producing the product.");
            st.push(i);
            notify();
        }
    }
    public synchronized void consumer() throws Exception{
        for(int i = 0; i<200; i++){
            if(st.isEmpty()){
                System.out.println("Nothing to consume going to sleep");
                wait();
            }
            System.out.println("Consuming the item : " + st.pop());
            notify();
        }
    }


}
