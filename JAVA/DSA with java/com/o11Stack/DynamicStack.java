//package com.o11Stack;
//
//public class DynamicStack extends CustomStack{
//
//    public DynamicStack(){
//        super(); // it will call CustomStack() ,constructor
//    }
//
//    public DynamicStack(int size){
//        super(size); // it will call CustomStack(int size)
//    }
//
//    public boolean push(int item){
//        // this take care of it being full
//        if(this.isFull()){
//            //double the array size
//            int[] temp=new int[data.length*2];
//
//            // copy all previous item in new data
//            for(int i=0;i<data.length;i++){
//                temp[i]=data[i];
//            }
//
//            data=temp;
//        }
//        // at this point we know array is not full
//        //insert item
//        return super.push(item);
//    }
//
//    public static void main(String[] args) throws Exception {
//        CustomStack stack=new DynamicStack(); // parent can be use as a type also but we are using dynamicstack only
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
