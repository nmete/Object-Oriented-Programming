package org.example.interfacepack;

public class NiceCar {
    Engine engine;
    Media player= new MediaClass();

    public NiceCar(){
        engine = new EnginClass();
    }

    public  void start(){
        engine.start();
    }

    public  void end(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }

    public void endEngine(){
        player.stop();
    }
}
