import javax.swing.text.AsyncBoxView;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Parent p= new child();
        p.run();

        List<Integer> l= Arrays.asList();
        l.stream().count();
    }
}

class Parent{
    public void walk(){
        System.out.println("Parent walk");
    }

    public void run(){
        System.out.println("parent run");
        walk();
    }
}


class child extends Parent{
    public void walk(){
        System.out.println("child walk");
        super.walk();
    }

    public void run(){
        System.out.println("child run");
        super.run();
    }
}