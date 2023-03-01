package com.o7BitManipulation;
//Set the ith bit
public class raj02 {

    public static void main(String[] args) {
        int a=24;
        int b=1<<3;
        int c=a|b;
        System.out.println(Integer.toBinaryString(c));
    }
}
