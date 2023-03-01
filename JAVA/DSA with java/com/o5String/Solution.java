package com.o5String;

class Solution {

    public static void main(String[] args) {
        String s="babad";
        String ss=new String("babad");
        System.out.println(longestPalindrome(s));
        StringBuilder sb=new StringBuilder("babad");
        sb.toString();
        System.out.println(s.equals(sb.toString()));
    }

   static public String longestPalindrome(String s) {
        int i=0;
        int j=s.length();
        while(i<=j)
        {
            if(palindrom(s.substring(i,j)))
                return s.substring(i,j);
            else if(palindrom(s.substring(i+1,j)))
                return s.substring(i+1,j);
            else if(palindrom(s.substring(i,j-1)))
                return s.substring(i,j-1);
            else
            {
                i++;
                j--;
            }
        }
        return "No answer";
    }
    
    static boolean palindrom(String s)
    {
        StringBuilder ss=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            ss.append(s.charAt(i));
        }
        if(s.equals(ss.toString())){
            return true;}
        return false;
    }
}