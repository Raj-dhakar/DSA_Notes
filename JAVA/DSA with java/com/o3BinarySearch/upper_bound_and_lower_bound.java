package com.o3BinarySearch;

import java.util.LinkedList;
import java.util.Queue;

public class upper_bound_and_lower_bound {

    public static void main(String[] args) {
        int[] arr={0,0,1,4,6,9};
        System.out.println(upper_bound(arr,3));
        System.out.println(lower_bound(arr,3));
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.remove(1);
        System.out.println(q.size());
        String s="abc";
        StringBuilder ans=new StringBuilder(s);
        System.out.println(ans.reverse());
    }

    static public int upper_bound(int[] arr,int target){
        int low=0,high=arr.length;

        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=target)
                low=mid+1;
            else high=mid;
        }
        return low;
    }

    static public int lower_bound(int[] arr,int target){
        int low=0,high=arr.length;

        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<target)
                low=mid+1;
            else high=mid;
        }
        return low;
    }
}
