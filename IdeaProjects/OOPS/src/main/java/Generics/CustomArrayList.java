package Generics;

import java.util.Arrays;
import java.util.Objects;

public class CustomArrayList<T> {
    private Object[]data;
    private static int default_size=10;
    int size=0;

    CustomArrayList(){
        data = new Object[default_size];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    void resize(){
        Object temp[]= new Object[data.length*2];

        for(int i=0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
       return size == data.length;
    }

    public T remove(){
        T num= (T)data[--size];
        return num;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomArrayList a= new CustomArrayList();
        a.add(12);
        a.add(23);
        a.add("aesfcaef");

        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i));
        }
    }
}
