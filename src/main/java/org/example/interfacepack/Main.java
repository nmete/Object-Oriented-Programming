package org.example.interfacepack;

public class Main {

    public static void main(String[] args) {
        Car car= new Car();

        car.stop();
        car.break1();
        car.start();

        NiceCar nc= new NiceCar();
        nc.startMusic();
        nc.start();
        nc.end();
        nc.endEngine();
    }
}
