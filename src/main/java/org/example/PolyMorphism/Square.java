package org.example.PolyMorphism;

public class Square extends  Shapes{
    void area(){
        System.out.println("area of square !!");
    }
    // method overloading
    void area(int side){
        System.out.println("are = "+ side*side);
    }
}
