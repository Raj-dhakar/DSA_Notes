package com.o1array_array_list;

import java.util.Arrays;

public class Leetcode88 {

    public static void main(String[] args) {
        int[] a={1,2,3,0,0,0};
        int m=a.length;
        int[] a1={2,5,6};
        int n=a1.length;
        merge(a,3,a1,3);
    }

    static public void  merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m+n-1;
        int p1=m-1,p2=n-1;
        while(p2>=0)
        {
            if(nums1[p1]<nums2[p2])
            {
                nums1[i]=nums2[p2];
                p2--;
                i--;
            }
            else if(nums1[p1]>nums2[p2])
            {
                nums1[i]=nums1[p1];
                p1--;
                i--;
            }
            else
            {
                nums1[i]=nums2[p2];
                p1--;
                i--;
                p2--;
            }
        }
        System.out.println(Arrays.toString(nums1));

    }
}
