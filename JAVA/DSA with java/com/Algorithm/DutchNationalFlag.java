package com.Algorithm;

import java.util.Arrays;

public class DutchNationalFlag {

    public static void main(String[] args) {
        int[] a={1,2,0};
        System.out.println(Arrays.toString(sort(a)));

    }
    static void swap(int[] nums,int a,int b)
    {
        int temp=nums[b];
        nums[b]=nums[a];
        nums[a]=temp;
    }

    static int[] sort(int[] nums)
    {
        int low=0,mid=0;
        int pivot=1;  //using this we can comapre to swap as taking 1
        int end=nums.length-1;

        while(mid<=end)
        {
            if(nums[mid]<pivot)  // if current element is 0
            {
                swap(nums,low,mid);
                ++mid;
                ++low;
                continue;
            }
            if(nums[mid]==pivot)  // if current element is 1
            {
                swap(nums,low,mid);
                ++mid;
                continue;
            }
            if(nums[mid]>pivot)  // if current element is 2
            {
                swap(nums,mid ,end);
                --end;
                ++mid;
                continue;
            }
        }
        return nums;
    }
}
