package Strings;
import java.util.*;
public class StringBasis {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        System.out.println(str.substring(0, 2));


        String k= new String("hello");
        String s= "hello";
        String h= "hello";


        System.out.println(s.equals(k));
        System.out.println(s==k);
        System.out.println(s == h);
        System.out.println(s.equals(h));
        //Strings are Immutable

        //string Builder
        StringBuilder strBuilder= new StringBuilder("h");
        strBuilder.append( "  neha");

        strBuilder.setCharAt(2, 'M');
        strBuilder.deleteCharAt(4);
        System.out.println(strBuilder);

        System.out.println(strBuilder.charAt(2));
    }
}
