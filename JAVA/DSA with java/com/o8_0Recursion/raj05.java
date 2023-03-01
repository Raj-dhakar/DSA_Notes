package com.o8_0Recursion;

public class raj05 {

    public static void main(String[] args) {
//        Number(5);
//        NumberReverse(5);
        NumberBoth(5);
    }

    static void Number(int n)
    {
        if(n==0)
            return ;
        System.out.println(n);
        Number(n-1);
    }

    static void NumberReverse(int n)
    {
        if(n==0)
            return ;

        NumberReverse(n-1);  // filling the value in stack
        System.out.println(n);  // we are printing when the stack is getting empty
    }

    static void NumberBoth(int n)
    {
        if(n==0)
            return ;
        System.out.println(n);
        NumberBoth(n-1);
        System.out.println(n);
    }

}
