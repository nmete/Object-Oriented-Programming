package AbstarctionClass;

public class Son extends Parent{
    @Override
    void career(String name) {
        System.out.println("I am carrer");
    }

    @Override
    void career1(String name) {
        System.out.println("I am career 1");
    }

    void print(){
        System.out.println("I am in son");
    }
}
