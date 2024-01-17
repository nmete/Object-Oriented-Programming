package Interface;

public class InterafaceImp implements Employee, Person{ // multiple inheritence
    @Override
    public void play() {

    }

    @Override
    public void display() {
        Person.super.display();
    }
}

interface Employee1{


      public void jobRole();

    public static double getSalary(double d, int r){
           return d*r;
    }

    public default void display(){
        System.out.println("display Employee");
    }
}


interface Person{
    public void play();

    public default void display(){
        System.out.println("display Person");

    }
}
