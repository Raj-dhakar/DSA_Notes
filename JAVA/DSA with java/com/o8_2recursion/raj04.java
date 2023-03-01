package com.o8_2recursion;
public class raj04 {

    public static void main(String[] args) {
        String up="baccaddsfhakfdhasdfha";
        String p="";
        RemoveChar(p,up);
        System.out.println(RemoveChar1(up));
        System.out.println(p);
        String aa="taappletab";
        System.out.println(RemoveString(aa));
    }

    // create a string which has removed a char from whole string
    static void RemoveChar(String p, String up) // p= processed or up=unprocessed
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            RemoveChar(p,up.substring(1));
        }
        else {
            RemoveChar(p+ch,up.substring(1));
        }
    }

    static String RemoveChar1( String up) // p= processed or up=unprocessed
    {
        if(up.isEmpty())
        {
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
           return  RemoveChar1(up.substring(1));
        }
        else {
          return ch+  RemoveChar1(up.substring(1));
        }
    }

    static String RemoveString( String up) // p= processed or up=unprocessed
    {
        if(up.isEmpty())
        {
            return "";
        }

        if(up.startsWith("apple"))
        {
           return  RemoveString(up.substring(5));
        }
        else {
          return  up.charAt(0)+ RemoveString(up.substring(1 ));
        }
    }

}
