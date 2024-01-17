package Interface;

public interface Test {
    public void dis();

    //after java 8 new feature
    default public void dis(String s){
        System.out.println("Test1");
    }

    static void dis(int a){
        System.out.println("Test dis int");

    }
}

interface Test2 {
    public void dis();

    //after java 8 new feature
    default public void dis(String s){
        System.out.println("Test2");
    }
}

