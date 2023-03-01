package com.o5String;

import java.util.Locale;

public class Palindrom {

    public static void main(String[] args) {
        String str="abccba";
        String a=null;
        System.out.println(palindrom(str));
        System.out.println(a);
    }

    static boolean palindrom(String str)
    {
        str=str.toLowerCase();
        if( str==null || str.length()==0 )
            return true;
        for(int i=0;i<str.length();i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
                return false;
        }
        return true;
    }
}
