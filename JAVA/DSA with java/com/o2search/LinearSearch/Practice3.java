package com.o2search.LinearSearch;
// Find the min element of an array

public class Practice3 {

    public static void main(String[] args) {
        int [] a={18,12,7,3,14,28};
        System.out.println(min(a));
    }
    static int min(int[] arr)
    {
        int mini=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(mini<arr[i])
            {
                // we will do nothing
            }
            else
            {
                mini=arr[i];
            }
        }
        return mini;
    }
}
