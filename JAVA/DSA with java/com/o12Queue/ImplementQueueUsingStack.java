package com.o12Queue;

import java.util.Stack;

public class ImplementQueueUsingStack {

    Stack<Integer> stack;
    Stack<Integer> stack2;
    int size=0;
    public ImplementQueueUsingStack(){
         stack=new Stack<>();
         stack2=new Stack<>();
    }

    public void push(int x){
        if(stack.isEmpty()) {
            stack.push(x);
            size++;
            return;
        }
        // shift all from stack1 to stack 2 first
        while(!stack.isEmpty()){
            stack2.push(stack.pop());
        }
        // push element in stack 1
        stack.push(x);
        size++;
        while(!stack2.isEmpty()){
            stack.push(stack2.pop());
        }
    }

    public int pop(){
        int remove=stack.pop();
        return remove;
    }

    public int peek(){
        int top=stack.peek();
        return top;
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ImplementQueueUsingStack queue=new ImplementQueueUsingStack();
          queue.push(1);
          queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
