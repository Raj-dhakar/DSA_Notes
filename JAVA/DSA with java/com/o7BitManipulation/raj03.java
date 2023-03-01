package com.o7BitManipulation;
//clear ith bit
public class raj03 {

    public static void main(String[] args) {
        int a=8;
        int mask=~(1<<3);
        int result=a&mask;
        System.out.println(result);
    }
}
