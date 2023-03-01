package com.o8_0Recursion;
// No of 0 in a number

public class raj09 {

    static int Zero(int n,int count)
    {
        if(n==0)
            return count;   // This will set the value o count to fix if we are emptying the stack so the count value dosent change
        if(n%10==0){
            return Zero(n/10,++count);}
        else{
            return Zero(n/10,count);}

    }

    public static void main(String[] args) {
        System.out.println(Zero(3030000,0));
    }
}
