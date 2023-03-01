package com.o5String;

// + operator is overloaded Which add 2 String
// But in java operator overloading is not define but it is given by its own as + operator

import java.util.ArrayList;

public class raj04StringConcatinTING {

    public static void main(String[] args) {
        // if we do + operator on char it convert it into intefer as ASCII value
        char a='a'+'b'; // if we use + operator it will convert thm to ASCII value
        char b='a';
        System.out.println('a'+'b');  // it will print ineger value
        System.out.println("a"+"b"); // it will print ab
        System.out.println((char)('a'+3));  // it will print integer value, to get char convert into char
        System.out.println(a);
        System.out.println(b);
        System.out.println((char)(97+98));  //97+98=='a'+'b'

        System.out.println("a"+1);  // if we use string with int it concatenate string with int
        // This si same as "a"+"1"
        //integer will be converted into Integer that will toString()

        System.out.println("Raj"+new ArrayList<>());
        System.out.println("Raj"+new Integer(56));

//        System.out.println(new Integer(56)+new ArrayList<>());
        /* This will give error as + operator is only define for primitive datatype or one datatype is String*/
        System.out.println(new Integer(56)+"add"+new ArrayList<>());  //This si valid
    }
}
