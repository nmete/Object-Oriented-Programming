package org.example.staticpackage;

public class StaticInteger {
    static int a= 100;
    static  int b;

    static {
        System.out.println("I am static blocks !!");
        b= a+10;
    }

    public static void main(String[] args) {
        StaticInteger in = new StaticInteger();
        System.out.println(a+" "+ b);
        StaticInteger in1 = new StaticInteger();
        System.out.println(a+" "+ b);
        StaticInteger in2 = new StaticInteger();
        System.out.println(a+ " "+b);
    }

}
