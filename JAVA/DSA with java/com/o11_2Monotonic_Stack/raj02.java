package com.o11_2Monotonic_Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class raj02 {

    // Incresing Stack

    public static void main(String[] args) {
        // when all the element are unique
        // Next Smaller
        System.out.println(Arrays.toString(NextSmaller(new int[]{6,2,9,4,3,1,5})));
        // With duplicate
        System.out.println(Arrays.toString(nextSmallerElements(new int[]{100,1,11,1,120,111,123,1,-1,-100})));

        // Previous Smaller
        System.out.println(Arrays.toString(PreviousSmaller(new int[]{6,2,9,4,3,1,5})));
    }

   static public int[] PreviousSmaller(int[] arr){

        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i= arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[i]<s.peek())
                map.put(s.pop(),arr[i]);
            s.push(arr[i]);
        }

        int i=0;
        for(int num:arr){
            arr[i++]=map.getOrDefault(num,-1);
        }
        return arr;
    }

    static public int[] NextSmaller(int[] arr){

        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            while(!s.isEmpty() && num<s.peek())
                map.put(s.pop(),num);
            s.push(num);
        }

        int i=0;
        for(int num:arr){
            arr[i++]=map.getOrDefault(num,-1);
        }
        return arr;
    }

    static  public int[] nextSmallerElements(int[] nums) {

        int n=nums.length;
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[n];
        Arrays.fill(ans,-1);

        for(int i=0;i<n;i++){
            int indx=i;
            while(!s.isEmpty() && nums[indx] < nums[s.peek()])
                ans[s.pop()]=nums[indx];

            s.push(indx);
        }
        return  ans;
    }
}
