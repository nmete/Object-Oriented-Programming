package Java8Features.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamQuestions {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,3,4,56,7,8,9, 2222, 22, 23, 28,34,56,7,8,8,12,34,78,9,9,6,6,5,5,900);

        int sum = list.stream().reduce((a, b)-> a+b).get();
        System.out.println(sum);

        // get double;
        list.stream().mapToInt(e-> e).average().getAsDouble();

        // get square of each number
        List<Integer> square= list.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println(square);
        System.out.println(list);

        List<Integer>even = list.stream().filter(x-> x%2 ==0).collect(Collectors.toList());
        List<Integer>odd = list.stream().filter(x-> x%2 !=0).collect(Collectors.toList());
       // even and odd numbers
        System.out.println(even+ "  ");
        System.out.println(odd+"  ");

        //Find numbers starting with 2
        List<Integer> l =  list.stream().map(x-> {
            int m=x;
            int r=x;
            while(x > 0){
                r= x%10;
                x= x/10;
            }
            if(r == 2){
                return m;
            }
            return -1;
        }).filter(p-> p!=-1).collect(Collectors.toList());

        l.stream()
                        .map(e-> String.valueOf(e))
                                .filter(e->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(l);

        // find the duplicate element
        Set<Integer> rep = list.stream().filter(e-> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println("repeated element list :"+ rep);
        Set<Integer> rep1 = list.stream().collect(Collectors.toSet());
        System.out.println("repeated element list :"+ rep1);

        //List<Integer> lst = list.stream().sorted().collect(Collectors.toList());
        // get maximum numbers from streams
        int lst  = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(lst);

        // get minimum numbers from streams
        int minlst = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(minlst);

        // find sum of first five numbers
        List<Integer> sum5 = list.stream().limit(4).collect(Collectors.toList());
        System.out.println(sum5);

        int sum55 = list.stream().limit(5).reduce((a, b)-> a+b).get();
        System.out.println(sum55);

        // find second numbers in streams
        int secH=  list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secH);

        int secL=  list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secL);
    }
}
