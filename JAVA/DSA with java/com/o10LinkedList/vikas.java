package com.o10LinkedList;

public class vikas {

    static void fun(int val)
    {
        if(val==1)
            return ;
        System.out.print("*"+(val-1));
        fun(val-1);
    }

    public static void main(String[] args) {

        for(int i=0;i<4;i++)
        {
            System.out.print((i+1)+"/"+(5-i)+"");
            fun((5-i));
            System.out.println();
        }
    }
}
