package com.o1array_array_list;
import java.util.*;

public class array_list {

    public static void main(String[] args) {

        ArrayList<Integer>  list =new ArrayList<>(5);
        Scanner sc=new Scanner(System.in);

        list.add(null);
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
//        list.set(0,99);  // this will add 99 to 0 index
        list.remove(2); //This will remove the index 2 element

        System.out.println(list);  // this will internally call its 2 string method
        System.out.println(list.contains(12));


        //input
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }

        //printing
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }

    }
}
