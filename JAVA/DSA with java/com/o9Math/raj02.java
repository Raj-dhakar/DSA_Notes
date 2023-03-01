package com.o9Math;

public class raj02 {

    public static void main(String[] args) {
//        PascalSUm(4);
//        Power(0);
//        Power(2,2);
        System.out.println(setBits(6));
    }

    // sum of nth row of Pascal triangle

    static void PascalSUm(int n)
    {
        System.out.println("The sum of nth row is "+ (1<<(n-1)));
    }

    // find a number is power of 2 or not

    static void Power(int n)
    {
        // 1 approach
//        int count=0;
//        while(n>0)
//        {
//            if((n&1)==1)
//                count++;
//            if(count>1)
//            {
//                System.out.println("Not a power of 2");
//                return ;
//            }
//            n=n>>1;
//        }
//        System.out.println("Yes its is a power of 2");

        //2 Approach
        if(n==0)  // handling the exception
        {
            System.out.println("Not a Power of 2");
            return ;
        }
        if((n&(n-1))==0)
            System.out.println("Yes it is a power of 2");
        else
            System.out.println("No it is not a power of 2");
    }

    // find a power b == a^b

    static void Power(int base,int pow)  // doing it in log(base) time
    {
        int ans=1;
        int b=base;
        while(pow>0)
        {
            if((pow&1)==1)
            {
                ans=ans*b;
                b=b*b;
            }
            else
            {
                b*=b;
            }
            pow=pow>>1;
        }
        System.out.println("the value is "+ans);
    }

    // No of set Bits

    static int setBits(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n-= (n& -n);
        }
        return count;
    }
}