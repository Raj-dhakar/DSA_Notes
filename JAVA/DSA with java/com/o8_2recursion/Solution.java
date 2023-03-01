package com.o8_2recursion;

import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        String a="hello";
        String b="ll";
        System.out.println(strStr(a,b));
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"abc");
        System.out.println(map.get(2));
    }


    static  public int strStr(String haystack, String needle) {
        int count=0;
        int c=ans( haystack,  needle,count);
        return c;
    }

    static int ans(String haystack, String needle,int count)
    {
        if(haystack.startsWith(needle))
            return count;
        if(haystack.isEmpty())
            return -1;
        else
        {
            return ans(haystack.substring(1),needle,count+1);
        }
    }
}