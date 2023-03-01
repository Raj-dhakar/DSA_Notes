package com.Algorithm;

import java.util.*;

public class FastPow {

    public static void main(String[] args) {

        // Modulo Exponentation
//        System.out.println(exponentMod(5,(int)1e15,(int)1e9+7));
//        StringBuilder ans=new StringBuilder("a");
//        String a="a";
//       String b= ans.toString();
//        System.out.println(a.equals(b));
        System.out.println(distinctPrimeFactors(36));

        int maxi=9;
       char ch=(char)('0'+maxi);
    }

    // Modulo Exponentation
    // use long as we return convert long tp int
    static public  long exponentMod(long A,
                            long B, int C)
    {

        // Base cases
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;

        // If B is even
        long y;
        if (B % 2 == 0)
        {
            y = exponentMod(A, B / 2, C);
            y = (y * y) % C;
        }

        // If B is odd
        else
        {
            y = A % C;
            y = (y * exponentMod(A, B - 1, C) % C) % C;
        }

        return ((y + C) % C);
    }

    // count primes till n(inclusive) 
   static public int countPrimes(int n) {

        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        int ans=0;
        for(int i=2;i<=n;i++)
        {
            if(isPrime[i]){
                ans++;
                for(int j=i+i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        return ans;
    }

    // prime factors
   static HashSet<Integer>  distinctPrimeFactors(int num) {

        // we goone use a hashSet as producrt will be very high
        HashSet<Integer> ans=new HashSet<>();


            while(num%2==0){
                ans.add(2);
                num/=2;}

            for(int i=3;i<=Math.sqrt(num);i++)
            {
                while(num%i==0)
                {
                    ans.add(i); num/=i;
                }
            }
            if(num>2) ans.add(num);

        return ans;
    }


}
