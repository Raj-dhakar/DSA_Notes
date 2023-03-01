package com.com.leetcode;

class Solution {

    public static void main(String[] args) {
        System.out.println(myAtoi("+1"));
    }
   static public int myAtoi(String s) {

       long ans=0;
       s=s.strip();
       boolean sign=true;
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);

           if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch=='.')
               break;

           if(ch==' ')
               continue;

           if(ans>Integer.MAX_VALUE)
           {
               if(!sign)
                   return Integer.MIN_VALUE;
               return Integer.MAX_VALUE;
           }

           if(i!=0 && (ch=='-' || ch=='+'))
               break;
           else if(i==0 && ch=='-')
               sign=false;
           else if(i==0 && ch=='+')
               sign=true;
           else {
               ans=ans*10+(ch-'0');
           }
       }
       if(sign)
           return (int)ans;
       else
           return (int)(-1*ans);
   }

}