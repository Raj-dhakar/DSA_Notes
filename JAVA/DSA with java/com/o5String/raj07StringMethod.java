package com.o5String;

import java.util.Arrays;
import java.util.HashMap;

public class raj07StringMethod {

    public static void main(String[] args) {
        String name="Raj Dhakar Is Great";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());  // a new object is created
        name.indexOf('a');
        System.out.println("         Raj".strip());
        name.stripLeading();  // remove whitespace from starting
        name.stripTrailing();  // remove whitespace from end
        System.out.println(Arrays.toString(name.split(" ")));  // as it is returning string array
         HashMap<Integer,Integer> map=new HashMap<>();
//         map.con
    }
}
