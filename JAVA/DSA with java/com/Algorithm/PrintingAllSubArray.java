package com.Algorithm;

public class PrintingAllSubArray {

    public static void main(String[] args) {
        // The number of subarray is =squeare of size of array
        //                           =n*n

        int[] arr=new int[]{0,1,2,3,4,5};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j< arr.length;j++)
            {
                for(int k=i;k<j;k++)
                System.out.print(arr[k]);

                System.out.println();
            }
        }
    }
}
