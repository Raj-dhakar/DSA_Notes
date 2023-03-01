package com.o3BinarySearch;

public class Raj01 {

    public static void main(String[] args) {

        int[] arr={-18,-12,-4,0,2,4,15,16,18,22,45,89};
        int target=22;
        int ans=BinarySearch(arr,target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist


    //this si applicable for ascending order array
    static int BinarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)  // we use tis loop as we dont know many times we need to run this loop
        {
            //find the middle element
            //int mid=(start+end) / 2; // there might be a case where it exceed the limit of int rang
            // instead of this use this
            int mid=start+ (end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                // ans found
                return mid;
            }

        }
        return -1;
    }
}
