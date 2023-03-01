package com.o1array_array_list;

import java.util.*;

public class Multi_dimensional_array {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    /* 1 2 3
     *  4 5 6
     *  7 8 9*/

//    int [][] arr=new int [3][]; //assigning number of columns is not necessary

//    int[][] arr2d={
//            {1,2,3}, //0th index
//            {4,5},  // 1st index
//            {6,7,8,9}  // 2nd index
//    };

    int[][] arr = new int[3][3];

    //inputting
        for (int rows=0;rows<arr.length;rows++)
        {
            for (int col=0;col<arr[rows].length;col++)
            {
                arr[rows][col]=sc.nextInt();
            }
        }
        //output
        for (int rows=0;rows<arr.length;rows++)
        {
            for (int col=0;col<arr[rows].length;col++)
            {
                System.out.print(arr[rows][col]+" ");
            }
            System.out.println();
        }
        //or

        for(int[] a :arr)
        {
            System.out.println(Arrays.toString(a)); // if u dont use this it will print the hashcode
        }

}
}
