package Java8Features.streamAPI;

public class StringClass {

    public static void main(String[] args) {
        String str1= "aBC";
        String str2= "ABC";
        String str3= new String("ABC");

        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3));

    }
}
