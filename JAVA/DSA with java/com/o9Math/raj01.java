package com.o9Math;

public class raj01 {

    public static void main(String[] args) {
          oddEven(6);
          UniqueElement(new int[]{1,1,2,2,3,3,4,5,5});
          Bits(6);
          BitsFormuls(6,10);  // to count no of bits in any form
       nthNumber(3);
//        System.out.println(1^1^1);


    }
    // odd or even using and opertor
    static void oddEven(int a)
    {
        if((a&1)==0)   // if 0th bit is 1 then odd else even
            System.out.println("Even");
        else System.out.println("Odd");
    }

    // Find the unique element in an array if all element are occuring twice

    static void UniqueElement(int[] a)
    {
        int unique=0;
        for(int i=0;i<a.length;i++)
        {
            unique^=a[i];
        }
        System.out.println("The unique elemnt ina an array is "+ unique);
    }

    //find nu,ber of bits in a decimal no
    static void Bits(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n>>1;  // doing right shift
        }
        System.out.println("the number of bits is "+count);
    }

    // we can even use formula to find number of bits

    static void BitsFormuls(int n,int base)
    {
        int ans=(int)(Math.log(n)/Math.log(base))+1;  // to count number of digits in any form
        System.out.println("Using formula " +ans);
    }

    // The nth magic umber

    static void nthNumber(int a)
    {
        int ans=0;
        int base=5;
       while(a>0)
       {
           int last=a&1;
           a=a>>1;
           ans+=last*base;
           base=base*5;
       }
        System.out.println(ans);
    }
}



