package com.o8_0Recursion;

public class raj04 {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch(a,5,0,a.length-1));  //This will return me the index of the element
    }

    static int BinarySearch(int[] a,int target,int s,int e)
    {
        if(s>e)
            return -1;
        int  m=s+(e-s)/2;

        if(a[m]==target)
            return m;
        if(target<a[m])
           return BinarySearch(a,target,s,m-1);
        else
         return  BinarySearch(a,target,m+1,e);
    }
}
