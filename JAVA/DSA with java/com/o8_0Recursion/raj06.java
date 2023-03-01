package com.o8_0Recursion;

public class raj06 {

    public static void main(String[] args) {
        System.out.println(Factorial(5));
        System.out.println(SumDigit(123));
        System.out.println(ProductDigit(123));
    }

    static int Factorial(int n)
    {

       if(n==1)
           return 1;
       return n*(Factorial(n-1));
    }

    static int SumDigit(int n)
    {
        if(n==0)
            return 0;
        int rem=n%10;
        n=n/10;
        return rem+(SumDigit(n));
    }

    static int ProductDigit(int n)
    {
        if(n==0)
            return 1;
        int rem=n%10;
        return rem*(ProductDigit(n/10));
    }
}
