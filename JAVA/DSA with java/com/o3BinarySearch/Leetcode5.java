package com.o3BinarySearch;

import java.util.Arrays;

public class Leetcode5 {
    public static void main(String[] args) {
        int[] a={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(a,2));
        System.out.println(Arrays.toString(a));
    }
    static  public int removeElement(int[] nums, int val) {
        int count=0;
        int s=0,e=nums.length-1;
        while(s<=e)
        {
            if(nums[s]==val  &&  nums[e]==val)
            {
                nums[e--]=0;
                count++;
            }
            else if(nums[s]==val)
            {
                nums[s]=nums[e];
                nums[e]=0;
                s++;
                e--;
                count++;
            }
            else if(nums[e]==val)
            {
                count++;
                nums[e--]=0;
                s++;
            }
            else
            {
                s++;
            }
        }
        return s;
    }
//    static  public int removeElement(int[] nums, int val) {
//        int count=0;
//        int s=0,e=nums.length-1;
//        while(s<=e)
//        {
//            if(nums[s]==val  &&  nums[e]==val)
//            {
//                nums[e--]=0;
//                count++;
//            }
//            else if(nums[s]==val)
//            {
//                nums[s]=nums[e];
//                nums[e]=0;
//                s++;
//                e--;
//                count++;
//            }
//            else if(nums[e]==val)
//            {
//                count++;
//                nums[e--]=0;
//                s++;
//            }
//            else
//            {
//                s++;
//            }
//        }
//        return count;
//    }
    }
