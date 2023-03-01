package com.o8_2recursion;
public class raj01 {

    public static void main(String[] args) {
        triangle1(4,0);
        triangle2(4,0);
    }

//    * * * *
//    * * *
//    * *
//    *
    static  void triangle1(int rows, int col)
    {
        if(rows==0)
            return ;
        if(col<rows)
        {
            System.out.print("*");
            triangle1(rows,col+1);
        }
        else
        {
            System.out.println();
            triangle1(rows-1,0);
        }
    }

    static  void triangle2(int rows, int col)
    {
        if(rows==0)
            return ;
        if(col<rows)
        {
            triangle2(rows,col+1);
            System.out.print("*");
        }
        else
        {
            triangle2(rows-1,0);
            System.out.println();
        }
    }
}

