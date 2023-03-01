package com.o3BinarySearch;

public class Leetcode4 {

    public static void main(String[] args) {

        int[] a={3,4,5,1};
//        System.out.println( peakIndexInMountainArray(a));
        int aa=0;
        while(aa<10)
        {
            System.out.println(10);
            aa++;
        }
    }

   static public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end=arr.length-1;


        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]  && arr[mid]>arr[mid-1])
                return mid;
            else
            {
                if(arr[mid]>arr[mid+1])
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }
}
