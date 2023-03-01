package com.o10LinkedList;

public class raj03 {
    public static void main(String[] args) {
       CLL list=new CLL();
       list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        System.out.println();
        list.delet(3);
        list.display();
    }
}
