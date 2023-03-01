package com.o8_0Recursion;

public class raj02 {
    public static void main(String[] args) {
        //write  a function that takes in a numbe and print it
        //print first 5 number :12345
        number1(1);


    }
    static void  number (int n)
    {
        System.out.println(n);
    }

    static void  number1(int n)
    {
        if(n==5) {            // it is a base condition to stop a recursion
            System.out.println(n);
            return;
        }
        System.out.println(n);
        number1(n+1);

    }
}
