//package com.o11Stack;
//
//class MinStack {
//
//    Stack<Integer> stack;
//    int min;
//    public MinStack() {
//        stack=new Stack<>();
//        min=Integer.MAX_VALUE;
//    }
//
//    public void push(int val) {
//        if(stack.isEmpty()){
//            stack.push(val);
//            min=val;
//             stack.push(min);
//        }
//        else{
//            stack.push(val);
//            min=Math.min(val,min);
//            stack.push(min);
//        }
//    }
//
//    public void pop() {
//        stack.pop();
//        stack.pop();
//        if(!stack.isEmpty())
//        min=stack.peek();
//    }
//
//    public int top() {
//        int remove=stack.pop();
//        int top=stack.peek();
//        stack.push(remove);
//        return top;
//    }
//
//    public int getMin() {
//        return stack.peek();
//    }
//}
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(val);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */