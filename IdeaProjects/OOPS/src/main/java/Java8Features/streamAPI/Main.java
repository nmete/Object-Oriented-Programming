package Java8Features.streamAPI;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // Q. create List and print even filter numbers
    //

    public static void main(String[] args) {
        List<Integer> l = List.of(1 , 2 , 8, 7 , 5, 6, 4);

        System.out.println(l);

        List<Integer> even = l.stream().filter(i-> i%2==0 && i > 6).collect(Collectors.toList());
        System.out.println(even);
    }
}
