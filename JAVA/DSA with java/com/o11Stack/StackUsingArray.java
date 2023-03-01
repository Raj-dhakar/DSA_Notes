package com.o11Stack;

import java.lang.reflect.Array;
import java.util.Arrays;

class Stack
{
     private static int[] a=new int[10];
    private static int i=-1;

    static void push(int n)
    {
        a[++i]=n;
        if(i==a.length-1)
        {
            int[] aa=new int[2*a.length];
            for(int j=0;j<a.length;j++)
            {
                aa[j]=a[j];
            }
            a=aa;
        }
//        System.out.println(Arrays.toString(a));
    }
    static void pop()
    {
        System.out.println(a[i]);
        a[i]=0;
        i--;

    }
    static void Display()
    {
        for(int k=0;k<i;k++)
        {
            System.out.println(a[k]);
        }
    }
}
public class StackUsingArray {

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(1);
        s.pop();
        s.push(1);
        s.push(1);
        s.push(1);
        s.pop();
        s.push(1);

       s.Display();
    }
}