package Threads;

public class MultiThread {


    public static void main(String[] args) {

        Mythread  mythread= new Mythread();
        mythread.run();
        for(int i=0;i<100;i++){
            System.out.print("main");
        }
    }
}

