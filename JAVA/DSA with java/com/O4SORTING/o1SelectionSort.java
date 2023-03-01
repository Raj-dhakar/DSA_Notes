package com.O4SORTING;

import java.util.Arrays;

public class o1SelectionSort {

    public static void main(String[] args) {
        int[] a={4,5,1,2,3};
        Selection(a);
        System.out.println(Arrays.toString(a));
    }

    static void swap(int[]a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void Selection(int[] a)
    {
        // find the largest element and swap it with the last element of selected array part

        // finding largest value and swapimg it
        for(int j=a.length-1;j>=0;j--)  // for swapng with last element of selected array not sorted
        {
            int max=Integer.MIN_VALUE;
            int index=0; // storing index value to swap
            for (int i = 0; i < j; i++)   // for max value
            {
                if(a[i]>max)
                {
                    max=a[i];
                    index=i;
                }
            }
            swap(a,index,j);
        }
    }
}
