package com.o11Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
   // using 2 queues
//    private  Queue<Integer> queue1;
//    private Queue<Integer> queue2;
//    public ImplementStackUsingQueue(){
//         queue1=new LinkedList<>();
//         queue2=new LinkedList<>();
//    }
//
//    public void push(int x){
//        // add element to queue 2
//        queue2.add(x);
//        // add all queue1 element to queue1
//            while(!queue1.isEmpty()){
//                queue2.add(queue1.remove());
//            }
//            // swapping 2 queues;
//            Queue<Integer> q=queue1;
//            queue1=queue2;
//            queue2=q;
//        }
//
//        public int pop(){
//        int remove=queue1.remove();
//        return remove;
//        }
//
//        public int top(){
//        int top=queue1.peek();
//        return top;
//        }
//
//        public boolean isEmpty(){
//        if(queue1.isEmpty())
//            return true;
//        return false;
//        }

    // using a single queue
    private Queue<Integer> queue;
    int size=0;
    public ImplementStackUsingQueue(){

        queue=new LinkedList();
    }

    public void push(int x){
        if(queue.isEmpty()){
            queue.add(x);
            size++;
            return;
        }
        queue.add(x);
        size++;
        int fix=size;
        while(size>1){
            int remove=  queue.remove();
            queue.add(remove);
            size--;
        }
        size=fix;
    }

    public int pop(){
        int remove=queue.remove();
        return remove;
    }

    public int top(){
        int top=queue.peek();
        return top;
    }

    public boolean isEmpty(){
        if(queue.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue stack=new ImplementStackUsingQueue();
        stack.push(3);
        stack.push(4);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
    }

