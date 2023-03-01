package com.o8_0Recursion;

public class raj07Impportant {

    public static void main(String[] args) {
        fun(5);
          Reverse1(1234);
        System.out.println(sum);
    }

    static void fun(int n)
    {
        if(n==0)
            return ;
        System.out.println(n);
//        fun(n--); // This will pass the value first then subtract it , it is a infinite recursion

        // n-- vs --n
        fun(--n); // this will subtract the value first then pass it
    }
   static int sum=0;
    static void Reverse1(int n)
    {
        if(n==0)
            return ;
        int rem=n%10;
        sum=sum*10+rem;
        Reverse1(n/10);

    }
}
