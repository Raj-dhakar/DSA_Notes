//package com.o11Stack;
//
//public class CustomStack {
//
//    protected int[] data;
//    private static  final int DEFAULT_SIZE=10;
//
//    int ptr=-1;
//
//    public CustomStack()
//    {
//        this(DEFAULT_SIZE); // using this we are calling it as a constructor
//    }
//
//    public CustomStack(int size)
//    {
//        this.data=new int[size];
//    }
//
//    public boolean push(int item){
//        if(isFull()){
//            System.out.println("Stack is Full");
//            return false;
//        }
//
//        ptr++;
//        data[ptr]=item;
//        return true;
//    }
//
//    public int pop() throws Exception {
//        if(isEmpty()){
//            throw new Exception("Cannot pop from an empty stack!");
//        }
//
////        int remove=data[ptr--];
////        return remove;
//
//        return data[ptr--];
//    }
//
//    public int peek() throws Exception {
//
//        if(isEmpty()){
//            throw new Exception("Cannot peek from an empty stack!");
//        }
//        return data[ptr];
//    }
//
//    public boolean isFull() {
//        return ptr==data.length-1;  // ptr is at end;
//    }
//
//    public boolean isEmpty() {
//        return ptr==-1;  // array is not even touched;
//    }
//
//    public static void main(String[] args) throws Exception {
//        CustomStack stack=new CustomStack();
//        // FILO=First In Last Out
//        stack.push(1);
//        stack.push(12);
//        stack.push(13);
//        stack.push(14);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//    }
//}
//
