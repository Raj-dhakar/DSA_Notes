package com.o1array_array_list;
import java.util.*;

public class Practice {
      // we can even reverse the array using swap function
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        swap(arr,2,4);

        System.out.println(Arrays.toString(arr));

    }
    // program to swap 2 number in an array
    static public void  swap(int[] a,int index1,int index2)
    {
         int temp=a[index1];
         a[index1]=a[index2];
        a[index2]=temp;

    }
}
