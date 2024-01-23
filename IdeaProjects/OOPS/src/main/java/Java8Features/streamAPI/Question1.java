package Java8Features.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

    public static void main(String[] args) {
        Employee e1= new Employee("neha", 23, 1000L);
        Employee e2= new Employee("neha", 26, 1000L);
        Employee e3= new Employee("neha", 25, 1000L);
        Employee e4= new Employee("neha", 29, 1000L);
        Employee e5= new Employee("neha", 22, 1000L);

        List<Employee> e= new ArrayList<>();
         e.add(e1);
         e.add(e2);
         e.add(e3);
         e.add(e4);
         e.add(e5);
        System.out.println(e);
        List<Employee> increament = e.stream().map(emp-> {
            if(emp.getAge()  > 25){
                emp.setSalary((emp.getSalary()* 1.10));
            }
            return emp;
        }).collect(Collectors.toList());
        System.out.println("\n -------------------------\n");
        System.out.println(increament);

//        System.out.println("\n -------------------------\n");
//        System.out.println(e);

    }


}

