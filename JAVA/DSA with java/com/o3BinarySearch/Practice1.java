package com.o3BinarySearch;

public class Practice1 {
//ceiling of a number == smallest element in array greater or = target
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target =14;
        int ans=CeilingNumber(arr,target);
        System.out.println(ans);
    }
    static int CeilingNumber(int[] a,int target)
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
        return a[start];  // the cndition where the loop breaks is our result to understand it see the notes
    }
}
