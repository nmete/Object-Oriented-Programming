package org.example;

public interface Runnable {
    void run();
}

// It has only once method that is run


interface Calculate{
    public int cal(int a, int b);
}

class  FunctionInterface{
    public static void main(String[] args) {
        Calculate add = (a,b)->a+b;

        System.out.println(add.cal(4,6));
    }
}