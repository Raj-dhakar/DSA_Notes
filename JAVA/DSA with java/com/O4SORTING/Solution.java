package com.O4SORTING;

class Solution {
    public static void main(String[] args) {
        int[] a={1,2,0};
        System.out.println(firstMissingPositive(a));
    }
     static void swap(int[]a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    
    static  public int firstMissingPositive(int[] a) {
        
        int i=0;
        while(i<a.length)
        {
            int correct=a[i]-1;
            if(a[i]<=0)
                i++;
            else if(a[i]>a.length)
                i++;
                else
                {
                    if(a[i]!=a[correct])
                        swap(a,i,correct);
                    else
                        i++;
                }
        }
        for(int j=0;j<a.length;j++)
        {
            
            if(a[j]!=j+1)
                return j+1;
        }
        return -1;
    }
}