package com.o8_3recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class raj01 {

    public static void main(String[] args) {
//        PhoneNumber("","12");
//        Map<Integer,String > map=new HashMap<>();
//        map.put(2,"abc");
//        map.put(3,"bssa");
//        System.out.println(map.get(2).length());
        System.out.println(letterCombinations("67"));
    }

    static void PhoneNumber(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }

        int digit=up.charAt(0)-'0';  //this will convert char 2 into number 2
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
            PhoneNumber(p+ch,up.substring(1));
        }
    }
   static public List<String> letterCombinations(String digits) {

        List<String> ans=new ArrayList<>();
       if(digits.length()==0)
           return ans;
       Map<Integer,String> map=new HashMap<>();
       map.put(2,"abc");
       map.put(3,"def");
       map.put(4,"ghi");
       map.put(5,"jkl");
       map.put(6,"mno");
       map.put(7,"pqrs");
       map.put(8,"tuv");
       map.put(9,"wxyz");

        ans=PhoneNumber1("",digits,map,ans);
        return ans;
    }

    static List<String> PhoneNumber1(String p,String up,Map<Integer,String> map,List<String> ans)
    {
        if(up.isEmpty())
        {
            ans.add(p);
            return ans;
        }
          int digit=up.charAt(0)-'0';
          for(int i=0;i<map.get(digit).length();i++)
          {
              char ch=map.get(digit).charAt(i);
              PhoneNumber1(p+ch,up.substring(1),map,ans);
          }

        return ans;
    }
}
