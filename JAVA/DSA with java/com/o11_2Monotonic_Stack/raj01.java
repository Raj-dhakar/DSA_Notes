package com.o11_2Monotonic_Stack;

import java.util.*;

// Monotonic Stack is of 2 types
// Incresing Stack
// Decreasing Stack
public class raj01 {

    // Decreasing Stack

    public static void main(String[] args) {
        // when aall the element are unique
        // Next Smaller number
        System.out.println(Arrays.toString(NextGreater(new int[]{6,2,9,4,3,1,5})));
        // if there are duplicate // here u need to play with index
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{100,1,11,1,120,111,123,1,-1,-100})));

        // previous Smaller number
        System.out.println(Arrays.toString(PreviousGreter(new int[]{6,2,9,4,3,1,5})));
    }

    private static int[] PreviousGreter(int[] arr) {

        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i= arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[i]>s.peek())
                map.put(s.pop(),arr[i]);
            s.push(arr[i]);
        }

        int i=0;
        for(int num:arr){
            arr[i++]=map.getOrDefault(num,-1);
        }
        return arr;
    }

    private static int[] NextGreater(int[] arr) {

        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
             while(!s.isEmpty() && num>s.peek())
                 map.put(s.pop(),num);
             s.push(num);
        }

        int i=0;
        for(int num:arr){
            arr[i++]=map.getOrDefault(num,-1);
        }
        return arr;
    }

    static  public int[] nextGreaterElements(int[] nums) {

        int n=nums.length;
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[n];
        Arrays.fill(ans,-1);

        for(int i=0;i<n;i++){
            int indx=i;
            while(!s.isEmpty() && nums[indx] > nums[s.peek()])
                ans[s.pop()]=nums[indx];

                s.push(indx);
        }
        return  ans;
    }

}
