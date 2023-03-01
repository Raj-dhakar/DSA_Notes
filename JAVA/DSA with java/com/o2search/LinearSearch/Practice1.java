package com.o2search.LinearSearch;
import java.util.*;
public class Practice1 {
// Find an element in a String
    public static void main(String[] args) {
        String name="RajDhakar";
        char target='D';
        System.out.println(Search(name,target));
    }

    static boolean Search(String str,char target)
    {
        if(str.length()==0)
            return false;
        for(int i=0;i<str.length();i++)
        {
             // if u want char at any index of String use below function
            if(str.charAt(i)==target)
                return true;
        }
        return false;
    }
}
