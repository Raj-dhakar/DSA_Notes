package com.o8_2recursion;

import java.util.ArrayList;

public class raj06 {

    public static void main(String[] args) {
        System.out.println('a'+0);
        subSequenceASCII("","abc");
        System.out.println(subSequence1ASCII("","abc"));
        char ch='a';
        ch= (char) (ch+32);
    }
    // print subsequence and acii vaue also
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

    static void subSequenceASCII(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSequenceASCII(p+(ch+0),up.substring(1));
        subSequenceASCII(p,up.substring(1));
    }

    static ArrayList<String> subSequence1ASCII(String p, String up)
    {

        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first=subSequence1ASCII(p+ch,up.substring(1));
        ArrayList<String> second=subSequence1ASCII(p,up.substring(1));
        ArrayList<String> third=subSequence1ASCII(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
