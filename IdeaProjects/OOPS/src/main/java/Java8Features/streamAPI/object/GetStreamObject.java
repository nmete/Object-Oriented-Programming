package Java8Features.streamAPI.object;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GetStreamObject {

    // empty stream
//    HashMap<In>


    public static void main(String[] args) {
        Stream<Object> emptyStream = Stream.empty();
        String names[]= {"neha", "mete", "szdjcb"};
        Stream<String> stream1= Stream.of(names);

        Stream<Object> streamBuilder = Stream.builder().build();
        IntStream st= Arrays.stream(new int[]{12, 34, 67, 23});
        //map
        // operation perform map(Function) each element operation
        List<String> names1 = List.of("Aman", "neha", "shubham", "Akash");

        List<Integer> numbers= List.of(12,45,67,9,90,25);
        List<Integer> square= numbers.stream().map(n-> n*n).collect(Collectors.toList());

        square.stream().sorted().forEach(System.out::print);

        int min = numbers.stream().min((x, y)-> x.compareTo(y)).get();
        System.out.println(min);
        List<Integer> even= List.of(12,45,67,9,90,25);
        List<Integer> el = even.stream().filter(x-> x%2 == 0).collect(Collectors.toList());
        System.out.println(el);
    }
}
