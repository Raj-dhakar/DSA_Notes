package com.o12Queue;

public class raj01 {

    public static void main(String[] args) throws Exception {
//        CustomQueue queue =new CustomQueue();
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(6);
//        queue.insert(6);
//        queue.insert(6);
//
//        queue.Display();
//        System.out.println(queue.remove());

        CircularQueue queue =new CircularQueue();
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.Display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.Display();
        queue.insert(3);
        queue.insert(6);
        queue.Display();

    }
}
