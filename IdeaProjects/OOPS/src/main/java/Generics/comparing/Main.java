package Generics.comparing;

public class Main {

    public static void main(String[] args) {
        Student s= new Student(112, "neha");
        Student n= new Student(5, "mete");

        if(s.compareTo(n) >= 0 ){
            System.out.println("s has more marks");
        }else{
            System.out.println("n has more marks");
        }


    }
}
