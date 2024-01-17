package AbstarctionClass;

public abstract class Parent {

    int age;
    abstract void career(String name);
    abstract void career1(String name);
    static void pr(){
        System.out.println("adadaefw");
    }

    void print(){
        System.out.println("I am in parents");
    }

    Parent(){
        System.out.println("contructor");
    }
    void parentMethod(){
        System.out.println("I am a parents specific methods");
    }
}
