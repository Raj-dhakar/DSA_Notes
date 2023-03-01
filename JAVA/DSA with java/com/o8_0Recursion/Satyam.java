package com.o8_0Recursion;
import java.util.*;


public class Satyam {

    static void fun(int[] a)
    {
        int max=a[0];
        int count=0;
        for (int i=0;i<a.length;i++)
        {
            if(i==0  && a[i]>a[i+1])
            {
//                System.out.println(i+" ");
                count++;
            } else if (i>0 && i<a.length-1)
            {
//                System.out.println(i+"    ");
                if(a[i]>max )
                    max=a[i];
                if(a[i]>=max && a[i]>a[i+1])
                    count++;
            }
            else
            {
//                if(a[i]==a.length-1 && a[i]>max)
//                    count++;
                if(i==a.length-1)
                {
//                    System.out.println(a[i]);
//                    System.out.println(max);
                    if(a[i]>max)
                        count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        while(T>0)
        {
            int N=sc.nextInt();
            int[] a=new int[N];
            // inputing data in array
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
//            System.out.println(a[a.length-1]);
           fun(a);
            T--;

        }
    }
}
