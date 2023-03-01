package com.o10LinkedList;

public class DLL {

    private Node head;
    private int size;

    DLL(){
        this.size=0;
    }

    public void insertFirst(int val){
        size++;
        Node node =new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){  // we need this check as first time head has no previous
        head.prev=node;}
        head=node;

    }

    public void insertLast(int val){
        size++;
        Node  node  =new Node(val);
        Node tail=head;
        if(head==null)
        {
            node.prev=null;
            head=node;
            return ;
        }
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=node;
        node.prev=tail;
        node.next=null;
    }

    public void insertAt(int indx,int val){
        if(indx==0) {
            insertFirst(val);
         return;
        }
        if(indx==size-1){
            insertLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<indx;i++){
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
    }

    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void DisplayReverse(){
        Node tail=head;
        //First we need the last node
        while(tail.next!=null){
            tail=tail.next;
        }
        while(tail!=null){  // if we put tail.prv as null it will  skip  the first value
            System.out.print(tail.val+"->");
            tail=tail.prev;
        }
        System.out.print("START");

    }
    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val)
        {
            this.val=val;
        }
        public Node (int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    public void DeleteFirst(){
        if(size==0)
            return;
        head=head.next;
    }

    public void DeleteLast(){
        if(size==0)
            return;
        if(size==1)
        {
            DeleteFirst();
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
    }

    public void DeleteAt(int indx){
        if(size==0)
            return;
        if(indx==1)
        {
            DeleteFirst();
            return;
        }
        if(indx==size-1){
            DeleteLast();
            return;
        }
        Node temp=head;
        for(int i=1;i<indx;i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;
        temp.next.prev=temp;
    }

    public boolean Search(int val){
        Node temp=head;

        while(temp!=null){
            if(temp.val==val)
                return true;
            temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertFirst(0);
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);

        list.Display();
        System.out.println(list.Search(3));
        System.out.println(list.Search(12));
    }
}
