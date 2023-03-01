package com.o8_2recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class raj03 {
    //Quick Sort (Pivot point)
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        System.out.println(Arrays.toString(a));
        QuickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
        StringBuilder s=new StringBuilder();
        s.append(34);
        System.out.println(s.reverse());
    }

    static void QuickSort(int[] a,int lo ,int hi)
    {
        if(lo>=hi)
            return ;

        int start=lo;
        int end=hi;
        int mid=start+(end-start)/2;  // Taking pivot as mid index as it will give me the best time complexity
        int pivot =a[mid];
        while(start<=end)
        {
            // also a region why if it already sorted it will not swap
            while(a[start]<pivot){
                start++;}
            while(a[end]>pivot){
                end--;}
            // this both will give me to values where the condition is vilating
            if(start<=end)
            {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index pleae sort 2 halfs now
        QuickSort(a,lo, end);
        QuickSort(a,start,hi);
    }
}
