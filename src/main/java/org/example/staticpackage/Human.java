package org.example.staticpackage;

public class Human {
    int id;
    String name;
    static  int population;
    Human(int id, String name){
        this.id = id;
        this.name = name;
        population+=1;
    }

    static void greet(){

        System.out.println(Human.population);
    }
}
