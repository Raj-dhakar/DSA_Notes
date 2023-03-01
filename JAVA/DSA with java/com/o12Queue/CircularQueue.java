package com.o12Queue;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;

    protected int end=0;
    protected int front=0;
    private int size=0;

    public CircularQueue()
    {
        this(DEFAULT_SIZE); // using this we are calling it as a constructor
    }

    public CircularQueue(int size)
    {
        this.data=new int[size];
    }

    public boolean isFull() {
        return size==data.length-1;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean insert(int item){
        if(isFull())
            return false;

        data[end++]=item;
        end=end% data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int item=data[front++];
        front=front% data.length;
        size--;
        return item;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    void Display(){
        for(int i=front;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue q=new CircularQueue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.Display();
        q.remove();
        q.Display();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

    }
}
