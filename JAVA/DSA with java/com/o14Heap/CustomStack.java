package com.o14Heap;
import java.util.*;
class CustomStack {
    int indx=-1;int size;
    class Node{
        int val;
        Node(int val){
            this.val=val;
        }
    }
    Stack<Node> stack;
    HashMap<Integer,Node> map=new HashMap<>();

    public CustomStack(int maxSize) {
        stack=new Stack<>();
        size=maxSize;
    }
    
    public void push(int x) {
        if(indx+1==size)
             return;
        Node node=new Node(x);
        stack.push(node);
        map.put(++indx,node);
    }
    
    public int pop() {
        stack.pop();
        Node ans= map.remove(indx--);
        return ans.val; 
    }
    
    public void increment(int k, int vall) {
        if(k+1>size){
            System.out.println("Out");
            return;}
        for(int i=0;i<=k;i++){
            Node node=map.get(i);
            node.val=node.val+vall;
        }
    }

    public static void main(String[] args) {
        CustomStack stack1=new CustomStack(3);
        stack1.push(1);
        stack1.push(2);
        stack1.pop();
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.increment(5,100);
        stack1.increment(2,100);
        System.out.println(stack1);
    }


}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */