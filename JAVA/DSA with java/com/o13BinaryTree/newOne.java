package com.o13BinaryTree;

public class newOne {

    public static void main(String[] args) {

        int size=0;

        size(5,0);
        System.out.println(size);
        int num=1;
        System.out.println(num);
        number(1);
        System.out.println(num);
    }

    public static int  size(int val, int size)
    {
        if(val==0) {
            System.out.println(size);
            return size;
        }

        return size=Math.max(size, size(val-1,size+1));
    }
    public static int number(int num)
    {
        num++;
        return num;
    }
}
