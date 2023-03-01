package com.o9Math;

public class raj05 {

    public static void main(String[] args) {
        factors(36);
        System.out.println(GCD(105,224));
        System.out.println(LCM(3,7));
    }
    static void factors(int n)  //Both time and space complixity is sqrt(n).
    {
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(n/i==i)
                    System.out.println(" "+i+" ");
                else
                System.out.print(i+" "+(n/i)+" ");
            }
        }
    }

    static int GCD(int a,int b)
    {
        if(a==0)
            return b;
        return GCD(b%a,a);
    }

    static int LCM(int a,int b)
    {
        return (a*b)/GCD(a,b);
    }
}
