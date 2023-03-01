package com.o8_0Recursion;

public class raj01 {

    public static void main(String[] args) {
        //Write a function, that prints hello world 5times ans can call only 1 time
         message();
    }


    static void message()
    {
        System.out.println("Hello Wrorld");
        message1();
    }
    static void message1()
    {
        System.out.println("Hello Wrorld");
        message2();
    }
    static void message2()
    {
        System.out.println("Hello Wrorld");
        message3();
    }
    static void message3()
    {
        System.out.println("Hello Wrorld");
        message4();
    }
    static void message4()
    {
        System.out.println("Hello Wrorld");
    }
}
