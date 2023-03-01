package com.o7BitManipulation;
//find the only non-repeating element in an array where every element repeat twice
public class raj05 {

    public static void main(String[] args) {
        int[] a={1,2,3,4,1,2,3};
        int res=0;
        for(int i=0;i<a.length;i++)
        {
            res=res^a[i];
        }
        System.out.println(res);
    }
}
