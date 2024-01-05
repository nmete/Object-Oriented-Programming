package org.example;

public class SingleTon {
    static SingleTon instance;
    private SingleTon(){
    }

    static SingleTon getInstance(){
         if(instance == null){
             instance =  new SingleTon();
         }
         return instance;
    }

}
