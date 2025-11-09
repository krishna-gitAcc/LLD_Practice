package com.ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer(50);

        Thread producerThread = new Thread(
            ()->{
                try {
                    pc.produce();
                } catch (Exception e) {
                }
            }
        );

        Thread consumerThread = new Thread(
            ()->{
                try {
                    pc.consumer();
                } catch (Exception e) {
                }
            }
        );

        producerThread.start();
        consumerThread.start();
    }
}
