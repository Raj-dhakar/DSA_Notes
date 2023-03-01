package com.o8_2recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class raj02 {
 // merge sort in place is for you
    public static void main(String[] args) {
        int[] a=new int[]{8,3,4,12,5,6};
//        MergeSort(a);  // we cant do this as it is returning a new arrays
        System.out.println(Arrays.toString(MergeSort(a)));
    }

    static int[] MergeSort(int[] a)
    {
         if(a.length==1)
             return a;

         int mid=a.length/2;

         int[] left=MergeSort(Arrays.copyOfRange(a,0,mid));  // it is creating a new object thats why we are returning it
         int[] rigth=MergeSort(Arrays.copyOfRange(a,mid,a.length));

         return merge(left,rigth);
    }

    private static int[] merge(int[] first,int[] second)
    {
        int[] a=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j< second.length)
        {
            if(first[i]<second[j])
            {
                a[k]=first[i];
                i++;
            }
            else
            {
                a[k]= second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array is not ompleted
        while(i< first.length)
        {
            a[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length)
        {
            a[k]=second[j];
            j++;
            k++;
        }
        return a;
    }
}
