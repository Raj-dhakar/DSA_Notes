package com.o5String;

public class solution1 {

    public static void main(String[] args) {
        String s="aba";
        System.out.println(validPalindrome(s));
    }
       static public boolean validPalindrome(String s) {
            int count=0;
            int i=0;
            int j=s.length()-1;
            while(i<=j)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    i++;
                    j--;
                    continue;
                }
                if(s.charAt(i)!=s.charAt(j) )
                {
                    if(subString(s,i+1,j))
                        return true;
                    return subString(s,i,j-1);
                }
            }
            return true;

        }

        private static boolean subString(String s,int st,int e)
        {
            int i=st;
            int j=e;
            while(i<=j)
            {
                if(s.charAt(i)!=s.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }

}
