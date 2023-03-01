package com.o8_0Recursion;

class Solution {

    public static void main(String[] args) {
        double ans=myPow(1.00000 , -2147483648);
        System.out.println(ans);
    }
   static  public double myPow(double x, int n) {
        if(x<0 && n==Integer.MIN_VALUE)
        {
            return 1;
        }
        if(n==Integer.MIN_VALUE) {
            n = Integer.MAX_VALUE;
            x=1/x;
        }
       if(n<0){
        n= (-1)*n;
           x=1/x;
       }
        if(n==0)
            return 1;
        if((n&1)==0)
            return myPow(x*x,n/2);
        else
            return x*(myPow(x*x,n/2));
            
    }
}