package com.o10LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public CLL(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    public CLL() {

    }

    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void delet(int val)
    {
        Node temp=head;
        while(temp.next.val!=val){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public void  display()
    {
        Node temp=head;
        do
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }while(temp!=head);

    }

    public boolean  Search(int val)
    {
        Node temp=head;
        do
        {
            if(temp.val==val)
                return true;
            temp=temp.next;
        }while(temp!=head);
           return false;
    }

    private class Node{
        int val;
        Node next;

        Node (int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.delet(4);
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.Search(3));
        System.out.println(list.Search(12));
    }
}
