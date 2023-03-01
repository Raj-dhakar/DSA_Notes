package com.o12Queue;

public class CustomQueue {

    private int[] data;
    private static final int DEFAULT_SIZE=10;

    int end=0;

    public CustomQueue()
    {
        this(DEFAULT_SIZE); // using this we are calling it as a constructor
    }

    public CustomQueue(int size)
    {
        this.data=new int[size];
    }

    public boolean isFull() {
        return end==data.length-1;
    }

    public boolean isEmpty() {
        return end==-1;
    }

    public boolean insert(int item){
        if(isFull())
            return false;

        data[end++]=item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int item=data[0];

        // now shift the element
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return item;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    void Display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }
}
