package com.o14Heap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void HeapSort(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            swap(arr,0,i);
            raj02.Maxheapify(arr,i,0);
        }
    }

    public static void swap(int[] arr,int lo,int hi){
        int swap=arr[lo];
        arr[lo]=arr[hi];
        arr[hi]=swap;
    }
}
