package com.o8_1Recursion;

import java.util.ArrayList;

public class raj02 {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,4,6,4};
        ArrayList<Integer> l=new ArrayList<>();
        occurances(a,4,0,l);
        System.out.println(l);
        occurances1(a,4,0);
        System.out.println();
        System.out.println(Search(new int[]{5,6,7,8,9,1,2,3},3,0,7));
    }

    // storing multiple occrances in list

    static ArrayList occurances(int[] a,int target,int index,ArrayList list)
    {
        if(index==a.length)
            return list;
        if(a[index]==target)
            list.add(index);
        return occurances(a,4,index+1,list);
    }

    //return will be ArrayList
    // But dont take it in argument

    static ArrayList occurances1(int[] a,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==a.length)
            return list;
        if(a[index]==target)
            list.add(index);

        ArrayList<Integer> ansFromBelowCalls = occurances1(a,target,index+1);
        // storing list data when the atckis getting emptying
        list.addAll(ansFromBelowCalls);

        return list;
    }

    //Rotatef Binary Search
    static int Search(int[] a ,int target,int s,int e)
    {
        if(s>e)
            return -1;

        int m=s+(e-s)/2;
        if(a[m]==target)
            return m;

        if(a[s]<=a[m])
        {
            if(target>=a[s] && target <= a[m])
               return    Search(a,target,s,m-1);
            else
                return  Search(a,target,m+1,e);
        }

        if(target >=a[m] && target<= a[e])
        {
            return Search(a,target,m+1,e);
        }
        return Search(a,target,e,m-1);
    }
}
