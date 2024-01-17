package cloning;

public class Main {

    public static void main(String[] args) {
        Human kunal= new Human(34, "kunal");

        try {
            Human neha = (Human) kunal.clone();
        }catch (Exception e){
            System.out.println("the exception is "+ e);
        }

    }
}
