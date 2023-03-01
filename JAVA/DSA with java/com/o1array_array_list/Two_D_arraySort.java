package com.o1array_array_list;

import java.util.Arrays;

public class Two_D_arraySort {

    public static void main(String[] args) {
        int[][] a={{1,3},{9,6},{8,10},{15,18}};
        Arrays.sort(a,(ar1,ar2)->Integer.compare(ar1[0],ar2[0]));

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int[][] arr=new int[][]{{3,2,1},{6,5,4}};

        for (int i=0;i< arr.length;i++)
        {
            Arrays.sort(arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[] b=a[0];
        System.out.println(Arrays.toString(a[0]));
    }
}
