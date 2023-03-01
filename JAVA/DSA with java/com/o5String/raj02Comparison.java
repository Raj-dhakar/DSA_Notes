package com.o5String;

public class raj02Comparison {

    public static void main(String[] args) {
        String a="Raj";
        String b="Raj"; // Raj is in pool so a and b is pointing to same object

        //==
        System.out.println(a==b);  // == is comparinng the reference of a and b

        String a1=new String("Raj");
        String a2=new String("Raj");
        System.out.println(a1==a2); // it compar value and reference
        System.out.println(a1.equals(a2));  // it will compare value

        // we cannot do this
//        System.out.println(a1[0]);  it is invalid

        // but we can do this
        System.out.println(a1.charAt(0));
    }
}
