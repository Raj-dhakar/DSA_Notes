package com.o5String;
//This program tells us why we should use string builder
public class raj05Perfomance {

    public static void main(String[] args) {
        String series="";

        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
//            System.out.println(ch);
            series+=ch; // here we are adding string + char which return string
        }
        System.out.println(series); // now the reference is changed as a new object is created
    }
}
