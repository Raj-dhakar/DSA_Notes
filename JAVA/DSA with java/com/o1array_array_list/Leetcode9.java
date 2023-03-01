package com.o1array_array_list;

public class Leetcode9 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));

    }
    static  public boolean isPalindrome(int x) {
        int sum=0;
        int re=0;
        int ans=x;
        if(x<0){
            return false;}
        while(x>0)
        {
            re=x%10;
            sum=sum*10+re;
            x=x/10;
        }
        if(ans==sum){
            return true;}
        return false;
    }
}
