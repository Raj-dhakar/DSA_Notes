package com.o5String;

public class raj01 {

    public static void main(String[] args) {
        int a1=10; // reference a pointing 10 in stack as it is primitive data type
        String a="Raj Dhakar"; //reference name pointing to Raj Dhakar
//        String b="Raj Dhakar";


        System.out.println(a);
        a="Dhakar";  // Here the object is not changed we create a new object is create for the reference
        System.out.println(a);
    }
}
