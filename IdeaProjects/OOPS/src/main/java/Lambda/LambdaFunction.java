package Lambda;

import java.util.ArrayList;

public class LambdaFunction {

    public static void main(String[] args) {

        ArrayList<Integer> ar= new ArrayList<>();

        for(int i=0;i<5;i++){
            ar.add(i+10);
        }

        ar.forEach((item) ->System.out.println(item*2));
    }

    int sum(int a, int b){
        return a+b;
    }
}

interface Sum{
    int sum(int a, int b);
}
