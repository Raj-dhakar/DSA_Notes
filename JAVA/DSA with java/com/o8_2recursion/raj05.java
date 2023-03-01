package com.o8_2recursion;

import java.lang.reflect.Array;
import java.util.*;

public class raj05 {

    public static void main(String[] args) {
        int a='a';
        System.out.println(a);
        subSequence("","abc");
        System.out.println(subSequence1("","abc"));
//        String s=Arrays.toString(new int[]{1,2,3});
//        System.out.println(subSequence1("",s));  //This will not work for array
    }
    // sub sequence
    static void subSequence(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSequence(p+ch,up.substring(1));
        subSequence(p,up.substring(1));
    }


    static ArrayList<String> subSequence1(String p, String up)
    {

        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> right=subSequence1(p+ch,up.substring(1));
        ArrayList<String> left=subSequence1(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
