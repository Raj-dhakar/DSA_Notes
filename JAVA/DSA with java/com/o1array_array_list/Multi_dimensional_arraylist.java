package com.o1array_array_list;
import java.util.*;

public class Multi_dimensional_arraylist {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();  //this is how we assign multidimensional arraylist

        //initialization
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>()); // initialization of lsit at each index
        }

        //add element
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                list.get(i).add(sc.nextInt()); //this means get the lsit at index i and add element to it
            }
        }
        System.out.println(list);
    }
}
