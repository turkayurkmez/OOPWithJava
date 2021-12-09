package com.company;

public class SuperWorker implements IWorker {
    @Override
    public void Work() {
        System.out.println("Sıkı çalış");
    }

    @Override
    public void Eat() {
        System.out.println("Yemek ye");

    }
}
