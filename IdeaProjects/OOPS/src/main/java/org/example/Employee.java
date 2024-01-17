package org.example;

import java.sql.SQLOutput;

public interface Employee {
    //each method is abstract
    // multiple interface can be implemented
    // 100% abstarction
    // public static and final variables are allowed
    // implementation of static and default methods available post java 8

      public void jobrole();
      public static double getSalary(double perDaySal, int numOfDays){
        return   perDaySal*numOfDays;
      }

      public default void  display(){
        System.out.println("Employee display");
    }
    }

    interface Person{

       public void jobRole();
        public default void  display(){
            System.out.println("person to display");
        }
    }

