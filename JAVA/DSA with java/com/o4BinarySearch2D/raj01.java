package com.o4BinarySearch2D;

import java.util.Arrays;

//Matrix is sorted in a row and  col manner
/*    10  20  30  40
*     15  25  35  45
*     28  29  37  49
*     33  34  38  50*/
public class raj01 {

    public static void main(String[] args) {
        int[][] a={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target=37;
        int[] ans={-1,-1};
        // Approach 1 (Brute force)  but complexity is worst
//        for(int i=0;i<a.length;i++)
//        {
//            for(int j=0;j<a[i].length;j++)
//            {
//                if(a[i][j]==target) {
//                    ans[0]=i;
//                    ans[1]=j;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(ans));

        //Approach 2  (2-Pointer approach)
        int start=0;
        int end=a[0].length-1;

        while(start<a.length && end>=0)
        {
            if(a[start][end] ==target)
            {
                ans[0]=start;
                ans[1]=end;
                System.out.println(Arrays.toString(ans));
                break;
            } else if (a[start][end]>target) {
                end--;
            }
            else {
                start++;
            }
        }
    }
}
