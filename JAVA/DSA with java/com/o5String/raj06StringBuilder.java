package com.o5String;

public class raj06StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
          builder.append(ch);
//          builder.
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0).reverse();
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder.toString());
    }
}
