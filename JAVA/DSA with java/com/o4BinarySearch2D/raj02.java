package com.o4BinarySearch2D;
// Find element ina sorted matrix
// this can be even doone by BS try to approach it later
import java.util.Arrays;

public class raj02 {

    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=15;
        int[] ans={-1,-1};

       int start=0;
       int end=a[0].length-1;

       while(start<a.length && end>=0)
       {
           if(a[start][end]==target)
           {
               ans[0]=start;
               ans[1]=end;
               System.out.println(Arrays.toString(ans));
               break;
           }
           else if(a[start][end]<target)
           {
               start++;
           }
           else {
               end--;
           }
       }
     }
}
