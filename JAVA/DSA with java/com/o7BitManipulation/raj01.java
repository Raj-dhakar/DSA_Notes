package com.o7BitManipulation;
// Find the ith bit
public class raj01 {

    public static void main(String[] args) {
        int a=34;
        //find the 6 bit
        int b=1<<6;
        System.out.println(a&b);
//        System.out.println(1<<1);

        for(int i=0;i<32;i++)
        {
            int aa=3;
            int bit=1<<i;
            System.out.println(aa&bit);
        }

    }
}
