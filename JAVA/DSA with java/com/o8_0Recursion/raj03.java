package com.o8_0Recursion;
//find nth Fibonacci Number
public class raj03 {

    public static void main(String[] args) {
//        System.out.println(Fib(50));
        for(int i=0;i<50;i++)
        System.out.println(i+" = "+fiboFormula(i));
    }

    static long fiboFormula(int n)
    {
        return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
    static int Fib(int n)
    {
        //base condition
        if(n<2)
            return n;

        else
            return Fib(n-1)+Fib(n-2);
    }
}
