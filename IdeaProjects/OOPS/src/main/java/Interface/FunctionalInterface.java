package Interface;

interface fun{
    public int add(int a,int b);
}
public class FunctionalInterface {

    public static void main(String[] args) {
        fun addition= (a,b) -> a+b;
        System.out.println(addition.add(12,45));
    }


}
