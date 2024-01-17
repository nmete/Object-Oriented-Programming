package Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int []data;
    private static int default_size=10;
    int size=0;

    CustomArrayList(){
        data = new int[default_size];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    void resize(){
        int temp[]= new int[data.length*2];

        for(int i=0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
       return size == data.length;
    }

    public int remove(){
        int num= data[--size];
        return num;
    }

    public int get(int index){
        return data[index];
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
        a.add(78);

        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i));
        }
    }
}
