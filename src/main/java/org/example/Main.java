package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student [] students= new Student[4];
         Student s1= new Student(12,  "neha");
        Student s2= new Student(13,  "neha");
        Student s3= new Student(14,  "neha");
        Student s4= new Student(15,  "neha");

        System.out.println(s1.toString());
       Integer a=10;
       Integer b=0;
       a=b;
        System.out.println("a = "+
                a);
       a= 100;
        System.out.println(a);
        System.out.println(a);
    }
}

class Student{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno= rollno;
        this.name= name;
    }


}