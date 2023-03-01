package com.o1array_array_list;

import java.util.*;

public class raj01 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //why do we need an array
        /*when we need many variable of same datatype */

        //syntax
        //datatype[] variable_name=new datatype[size];
//        int[] rolln0=new int[10];
        //or directly
//        int [] roll_no={1,2,3,4,5,6,7,8,9,0};

//        int[] ros; // declaration of an array ros is getting define in the  stack.
//        ros=new int [5]; // actually here object is being created in the memory(heap).heap objects are
        // not continuous .Dynamic memory allocation,hence array object may not be continous.
        //depend on JVM  all memory is in JVM

//        String[] s=new String[1];
//        System.out.println(s[0]);
//        String str=null;
//        int a=null;  it can't be happened as it is only allocated to string
        //each element in array si considered as object abd  it points to null by default
        //reference variable are a[0],a[1].

        int[]  arr=new int[5];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        System.out.println(arr[3]);

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //printing the array
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //using for each loop
        for (int x:arr)
            System.out.print(x+" ");

        System.out.println(Arrays.toString(arr));  //it converts the array into string
    }

}
