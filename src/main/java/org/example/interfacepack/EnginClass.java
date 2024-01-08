package org.example.interfacepack;

public class EnginClass implements Engine{
    @Override
    public void start() {
        System.out.println("start the interface ");
    }

    @Override
    public void stop() {
        System.out.println("end the interface ");
    }
}
