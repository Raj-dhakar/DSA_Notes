package com.O4SORTING;

import java.util.Arrays;

public class o3CyclicSort {

    public static void main(String[] args) {
        int[] a={5,3,4,1,2};
        Cyclic(a);
        System.out.println(Arrays.toString(a));
    }

    static void swap(int[]a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void Cyclic(int[] a)
    {
        int j=0;
        while(j<a.length)
        {
            int correctIndex=a[j]-1; // correctIndex=value-1;
            if(a[j]!=a[correctIndex])  // This check if value is at correct index
                swap(a,j,correctIndex);
            else {
                j++;
            }
        }
    }
}
