package com.O4SORTING;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] b={5,4,3,2,1};
        System.out.println(Arrays.toString(b));
        bubble(b);
        System.out.println(Arrays.toString(b));
    }

    static void bubble(int[] a)
    {
        //run the step n-1 times
        for(int i=0;i<a.length;i++)
        {
            //for each step max item will come at the last index
            for(int j=1;j<a.length-i;j++)
            {
                if(a[j]<a[j-1])
                {
                    System.out.println("Interchanging between "+a[j]+" and "+a[j-1]);
                    //swap
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
}
