package com.o7BitManipulation;
// find the no of bits to change a to b
public class raj04 {

    public static void main(String[] args) {
        int a=22;
        int b=27;
        int result=(a^b);  // using this the we get the no of bits require to change
        // loop to check set bit
        int count=0;
        int sum=0;
        while(result>0)
        {
            result=result&(result-1);
            count++;
        }
        System.out.println("So the bits require to change are "+count);
    }
}
