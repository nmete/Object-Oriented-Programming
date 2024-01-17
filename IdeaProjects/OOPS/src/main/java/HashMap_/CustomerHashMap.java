package HashMap_;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class CustomerHashMap {

    public static void main(String[] args) {
        Map<String,String> mp= new HashMap<>();
        Map<Emp,String> playes= new HashMap<>();


        Emp s1= new Emp("neha",1);
        Emp s2= new Emp("manish",2);
        Emp s3= new Emp("sweta",3);
        Emp s4= new Emp("neha",2);

        playes.put(s1,"lagadi");
        playes.put(s2, "cricket");
        playes.put(s3,"hokey");
        playes.put(s4,"tennis");

        System.out.println(playes);
    }

}
