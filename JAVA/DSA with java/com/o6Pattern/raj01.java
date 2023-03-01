package com.o6Pattern;

public class raj01 {

    public static void main(String[] args) {
//        pattern1(5,5);
//        Pattern2(5,5);
//        Pattern3(5,5);
//        Pattern4(5,5);
        Pattern5(8,5);
        System.out.println(3&4);
    }

//    *****
//    *****
//    *****          Pattern1
//    *****
//    *****
    static void pattern1(int rows,int col)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=col;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    *
//    **
//    ***        Pattern2
//    ****
//    *****

    static void Pattern2(int rows,int col)
    {
        for (int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    *****
//    ****
//    ***    Pattern3
//    **
//    *

    static void Pattern3(int rows,int col)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=(col+1)-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

//    1
//    12
//    123   Pattern4
//    1234
//    12345

    static void Pattern4(int rows,int col)
    {
        for (int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

//    *
//    **
//    ***
//    ****
//    *****     Pattern5
//    ****
//    ***
//    **
//    *

    static void Pattern5(int rows,int col)
    {
        for (int i=1;i<=col;i++)
        {
            for(int j=1;j<=i && j<=col;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=col+1;i<=rows;i++)
        {
            for(int j=1;j<=col-((i-col));j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
