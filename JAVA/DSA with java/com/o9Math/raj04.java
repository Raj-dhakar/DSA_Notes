package com.o9Math;

public class raj04 {

    public static void main(String[] args) {
        System.out.println( squareroot(8,1));
    }
    static double squareroot(int n,int p)
    {
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(m*m==n)
                return m;
            if(m*m>n)
                e=m-1;
            else
                s=m+1;
        }
        // for precision
        double inc=0.1;
        for(int i=0;i<p;i++)
        {
            while(root*root<=n)
                root+=inc;
            root-=inc;
            inc/=10;   // for next inc we need more decimla value
        }

        return  root;
    }
}
