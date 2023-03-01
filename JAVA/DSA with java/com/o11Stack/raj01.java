package com.o11Stack;

import java.util.*;
import java.util.Stack;

public class raj01 {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
//        stack.isEmpty()
//        // FILO=First In Last Out
        stack.push(1);
        stack.push(12);
//        stack.push(13);
//        stack.push(14);
//
        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        // If we remove from a empty stack it will throw a exception EmptyStackException as we cant remove from a empty stack

//        Queue<Integer> queue=new LinkedList<>();
//        // Queue is a interface which is implemented inside LinkedList so we take class as LinkedList
//        queue.add(3);
//        queue.add(6);
//        queue.add(6);
//        queue.add(6);
//        queue.add(6);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque=new ArrayDeque<>();
    //Resizable-array implementation of the Deque interface. Array dequeue have no capacity restrictions;
        // they grow as necessary to support usage.
//This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.

               deque.add(89);
               deque.addFirst(78);
               deque.addLast(45);
               deque.removeFirst();
               deque.removeLast();
    }
}
