package com.o8_1Recursion;

import java.util.ArrayList;

public class raj01 {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println(sorted(a,0));
        findAllIndex(a,1,0);
        findAllIndex(a,4,0);
        findAllIndex(a,3,0);
        findAllIndex(a,9,0);
        findAllIndex(a,3,0);
        System.out.println(list);
    }
    //Find if array is sorted

//    static boolean sorted(int[] a,int start)   //Raj
//    {
//        if((start==a.length-2  && a[start]<a[start+1]))
//            return true;
//        if(a[start]<a[start+1]  )
//            return sorted(a,++start);
//        if(a[start]>a[start+1])
//            return false;
//        return true;
//    }

    static boolean sorted(int[] a,int index)     //kunal kushwaha
    {
        //base condition
        if(index==a.length-1)
            return true;

        return a[index]<a[index+1] && sorted(a,index+1);
    }

    //Linear Search
    static boolean LinearSearch(int[] a,int target,int index)
    {

        if(index==a.length-1 && a[index]!=target)
            return false;
        return a[index]==target || LinearSearch(a,9,index+1);
    }

    //for multiple element
   static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] a,int target,int index)
    {
        if(index==a.length)
            return ;
        if(a[index]==target)
            list.add(index);
        findAllIndex(a,target,index+1);
    }
}
