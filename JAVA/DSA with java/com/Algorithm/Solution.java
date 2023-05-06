package com.Algorithm;
import java.util.*;

class  Solution{

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("king");
        list.add("a");
        list.add("b");
        String last="a";
        String last_=last;
       int indx= list.indexOf(last_);
        list.add(indx+1,"c");
        System.out.println(list);
    }
}