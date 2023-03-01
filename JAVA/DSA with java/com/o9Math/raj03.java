package com.o9Math;

import java.util.HashMap;

public class raj03 {

    public static void main(String[] args) {
//       for(int i=0;i<20;i++)
//       {
//           System.out.println(i+" "+Prime(i));
//       }
        int n=40;
        boolean[] primes=new boolean[n+1];  // initially the boolean array contains false
        int ans=squareRoot(25);
        System.out.println(ans);
    }

    // Prime number
//    static void Prime(int n)
//    {
//        int count=0;
//        for(int i=1;i<n/2;i++)
//        {
//            if(n%i==0)
//                count++;
//        }
//        if(count==1)
//            System.out.println("Prime number");
//        else
//            System.out.println("Not PRIME number");
//    }

    //Better approach
    static boolean Prime(int n)      // Time complexity is sqrt(n)
    {
        if(n<=1)
            return false;
        int c=2;
        while(c*c<=n)   //This is equals to c<=sqrt(n)
        {
            if(n%c==0)
                return false;
            c++;
        }
        return true;
    }

   static int  squareRoot(int n)
   {
       int i=0;
       int j=n;
       while(i<=j)
       {
           int m=i+(j-i)/2;
           if(m*m==n)
               return m;
           else if(m*m>n)
               j=m-1;
           else
               i=m+1;
       }
       return -1;
   }
}
