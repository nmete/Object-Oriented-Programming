package org.example.Inheritance;

public class Main {

    public static void main(String[] args) {
        child c= new child();
        c.greet();

        Base ref= new child();
        ref.greet();

        child2 multilevel = new child2();
     }
}
