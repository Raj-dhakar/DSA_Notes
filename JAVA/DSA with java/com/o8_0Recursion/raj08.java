package com.o8_0Recursion;
//Palindrome of a number

public class raj08 {

    static int sum=0;
    static void Reverse1(int n)
    {
        if(n==0)
            return ;
        int rem=n%10;
        sum=sum*10+rem;
        Reverse1(n/10);

    }

    static boolean Palindrome(int n)
    {
        Reverse1(n);
        return n == sum;
    }

    // Better Approach
//    static boolean Palindrome(int n,int s,int e)
//    {
//
//    }

    public static void main(String[] args) {
        System.out.println(Palindrome(12344321));
    }
}
