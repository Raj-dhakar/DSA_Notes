package com.o2search.LinearSearch;

import java.util.Arrays;

//Search in an 2d array
public class Practice4 {

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6,},
                {7,8,9,0}
        };
      //  int[]b=new int[]{1,2,3}; //  this is valid
        int[] ans=search(arr,5);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] a,int target)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
