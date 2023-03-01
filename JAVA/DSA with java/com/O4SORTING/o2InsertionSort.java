package com.O4SORTING;

import java.util.Arrays;

public class o2InsertionSort {

    public static void main(String[] args) {
        int[] a={5,3,4,1,2};
        Insertion(a);
        System.out.println(Arrays.toString(a));
    }

    static void swap(int[]a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void Insertion(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j>0;j--) // j is running i+1 to 0
            {
                if(a[j]<a[j-1])
                swap(a,j,j-1);
                else
                    break;
            }
        }
    }
}
