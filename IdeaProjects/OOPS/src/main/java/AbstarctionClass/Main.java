package AbstarctionClass;

public class Main {

    public static void main(String[] args) {

        Son s= new Son();
        s.print();

       Parent p = new Son();
       p.print();
       p.parentMethod();
    }
}
