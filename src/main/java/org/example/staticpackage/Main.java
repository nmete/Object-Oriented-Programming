package org.example.staticpackage;

public class Main {
    public static void main(String[] args) {
        Human h= new Human(12, "neha");
        Human h1= new Human(12, "neha");
        Human h2= new Human(12, "neha");

        System.out.println(Human.population);
        Main m = new Main();
        m.greet();
    }

    void greet(){
        System.out.println("i am non-static methods");
    }
}
