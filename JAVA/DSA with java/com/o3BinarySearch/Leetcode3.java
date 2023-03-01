package com.o3BinarySearch;
//Find position of an element in a sorted array of infinite number
public class Leetcode3 {

    public static void main(String[] args) {// we cant use array.length
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int target=5;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target)
    {
       //first find the range
        //first start with the index of box of size 2
        int start=0;
        int end=1;

        //condition for the target to lie int rang
        while(target>arr[end])
        {
            int temp=end+1;//this is my new start
            //double the boc value
            //end=previous end+sizeofbox*2
            end=end+(end-start+1)*2;
            start=temp;
            start=temp;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr,int target,int start,int end)
    {


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
