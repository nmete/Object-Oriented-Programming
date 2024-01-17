package org.example;

public class interfaceExp implements Employee, Person {

    @Override
    public void jobrole() {
        System.out.println("");
    }

    @Override
    public void display() {
        Employee.super.display();
    }

    @Override
    public void jobRole() {
        System.out.println("");
    }

//    @Override
//    public void display() {
//        Person.super.display();
//        Employee.super.display();
//    }

    public static void main(String[] args) {
        interfaceExp c1= new interfaceExp();
        c1.display();
    }

}

// abstarct class can not be institiated