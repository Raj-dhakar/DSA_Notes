package com.o10LinkedList;
public class raj01 {

    public static void main(String[] args) {
        LL list=new LL();
//        2,1,3,5,6,4,7
//        list.insert(7);
//        list.insert(4);
//        list.insert(5);
        list.insert(3);
        list.insert(5);
        list.insert(9);
        list.insert(1);
////        list.inserLast(2);
////        list.inserAt(2,45);
////        list.Display();
////        list.DeletFirst();
////        list.DeletLast();
//        list.Display();
////        list.size();
////        list.DeletAt(2);
////        list.swap();
        list.insertREcursion(77,3);
        list.Display();

    }
}
