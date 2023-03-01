package com.o3BinarySearch;

public class leftModt_BinarSearch {
// we can call it as lower_bound
    public static void main(String[] args) {
        // if there are miultiple occurence in return one
        System.out.println(Binary_Search(new int[]{1,2,3,4,4,4,6,6,7},4));
        // if element is not pressent i will give the index will it must be put
        System.out.println(Binary_Search(new int[]{1,2,3,4,5,6,8,9},7));
    }
    static int Binary_Search(int[] arr,int target){

        int low=0,high= arr.length;

        while(low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]<target) low=mid+1;
            else high=mid;
        }
        return low;
    }
}
