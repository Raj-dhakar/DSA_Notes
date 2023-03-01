package com.o10LinkedList;
public class LL {

    private Node head;
    private Node tail;  // By taking tail we can insert element at last in constant time;

    private int size;
    public LL(){   // When we inttiliazed a linked list itwill create a empty LL
        this.size=0;
    }

    public void size()
    {
        System.out.println(size);
    }

    public Node reverseList() {
        Node reverse=null;
        Node temp=head.next;
        while(head!=null)
        {
            head.next=reverse;
            reverse=head;
            head=temp;
            if(temp!=null)
            temp=temp.next;

        }
        return reverse;
    }
    public void swap()
    {
        Node temp=head;
        while(temp!=null && temp.next!=null){
            int val=temp.value;
        temp.value=temp.next.value;
        temp.next.value=val;
        temp=temp.next.next;}
    }

    public void insert(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null)
            tail=head;

        size++;
    }
//insertion using recursion
    public void insertREcursion(int val,int indx)
    {
        head=insertRec(val,indx,head);
    }

    private Node insertRec(int val,int indx,Node node){
        if(indx==0)
        {
            Node Node =new Node(val,node);
            size++;
            return Node;
        }
       node.next= insertRec(val,indx-1,node.next);
        return node;
    }
    public void inserLast(int val)
    {
        if(tail==null)  // what if the user use it fo the first element
        {
            insert(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void inserAt(int indx,int val){
        if(size==0)
        {
            insert(val);
            return;
        }
        if(indx==0) {
            insert(val);
            return;
        }
        if(indx==size) {
            inserLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<indx;i++){  // we cant start from 0 as temp is already at head or 0
            temp=temp.next;
        }
        Node node =new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public int DeletFirst(){
        int val=head.value;
        head=head.next;
        if(head==null)
            tail=null;
        size--;
        System.out.println(val);
        return val;
    }

    public int DeletLast(){
        int val=tail.value;
        if(size==1) {
            DeletFirst();
            return val;
        }
        Node temp=head;
        for(int i=1;i<size-1;i++){  // as my temp is already at head
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;

        System.out.println(val);
        return val;
    }

    public int DeletAt(int indx)
    {
        if( indx==0){
           return DeletFirst();
        }
        if(indx==(size-1)){
          return   DeletLast();}

        Node temp=head;
        for(int i=1;i<indx;i++){
            temp=temp.next;
        }
        temp.next=(temp.next).next;
        System.out.println((temp.next).value);
        return (temp.next).value;
    }

    public void Display()
    {
        Node temp;
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void Display(Node reverse)
    {
        Node temp;
        temp=reverse;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    public boolean Search(int val){

        if(head==null)
            return false;
        Node temp=head;
        while(temp!=null){
            if(temp.value==val)
                return true;
            temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.inserAt(0,5);
        list.inserAt(1,2);
        list.inserAt(0,0);
        list.Display();
        System.out.println(list.Search(0));
        System.out.println(list.Search(5));

    }

}
