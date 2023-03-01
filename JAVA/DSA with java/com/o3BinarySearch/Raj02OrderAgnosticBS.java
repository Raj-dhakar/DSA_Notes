package com.o3BinarySearch;

public class Raj02OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,4,15,16,18,22,45,89};
        int[] arrr={9,8,7,6,5,4,3,2,1,0};
        int target=22;
        int targett=2;
        int ans=orderAgnosticBS(arr,target);
        int anss=orderAgnosticBS(arrr,targett);
        System.out.println(ans);  // for ascending
        System.out.println(anss);// for descending
    }
    //this is use when we don't know if the array is arranged in ascending order or descendig order

    static int orderAgnosticBS(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;

        //find whether array is sorted in ascending or descending order
        boolean isAsc;
        if(arr[start]<arr[end])
            isAsc=true;
        else
            isAsc=false;

        while(start<=end)  // we use tis loop as we dont know many times we need to run this loop
        {
            //find the middle element
            //int mid=(start+end) / 2; // there might be a case where it exceed the limit of int rang
            // instead of this use this
            int mid=start+ (end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }

           if(isAsc)
           {
               if(target<arr[mid])
               {
                   end=mid-1;
               }
               else if(target>arr[mid])
               {
                   start=mid+1;
               }

           }
           else {
               if(target>arr[mid])
               {
                   end=mid-1;
               }
               else if(target<arr[mid])
               {
                   start=mid+1;
               }

           }

        }
        return -1;
    }
}
