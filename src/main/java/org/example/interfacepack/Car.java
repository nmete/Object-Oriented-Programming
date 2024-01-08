package org.example.interfacepack;

public class Car implements Break, Engine{
    @Override
    public void break1() {
        System.out.println("break like pro");
    }

    @Override
    public void start() {
        System.out.println("I start the car here");
    }

    @Override
    public void stop() {
        System.out.println("I stop here");
    }
}
