package org.example;

import java.net.SocketOption;

public class Student {
    String name;
    int roll;
    public static int count=0;

    public Student(String name){
        this.name = name;
        count+=1;
        roll=count;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public static void main(String[] args){
        Student s1= new Student("neha");
        Student s2= new Student("shubham");
        Student s3= new Student("snehal");
        Student s4= new Student("niki");

        System.out.println("roll number" + s1.getRoll());
        System.out.println("roll number" + s2.getRoll());
        System.out.println("roll number" + s3.getRoll());
        System.out.println("roll number" + s4.getRoll());

    }
}
