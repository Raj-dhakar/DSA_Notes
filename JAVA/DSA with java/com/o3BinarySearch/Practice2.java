package com.o3BinarySearch;

public class Practice2 {
//Floor of a number =Greatest number that is smaller or=target
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target =15;
        int ans=FloorNumber(arr,target);
        System.out.println(ans);
    }

    static int FloorNumber(int[] a,int target)
    {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int num=a[mid];
            if(a[mid]==target)
            {
                return a[mid];
            }
            else if(a[mid]>target)
            {
                end=mid-1;
            }
            else if(a[mid]<target){
                start=mid+1;
            }
        }
        return a[end];  // the cndition where the loop breaks is our result to understand it see the notes
    }
}
