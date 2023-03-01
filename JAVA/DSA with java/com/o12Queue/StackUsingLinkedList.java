package com.o12Queue;

public class StackUsingLinkedList {

    int size=0;
    Node head;
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

        public void push(int val){
            Node node=new Node(val);

            node.next=head;
            head=node;
            size++;
        }

        public int pull()
        {
            if(isEmpty())
                return -1;
            int val=head.val;
            head=head.next;
            size--;
            return val;
        }

        public boolean isEmpty()
        {
            if(size==0)
                return true;
            else
                return false;
        }

        public void Display() {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("END");
        }
        public static void main(String[] args) {
            StackUsingLinkedList s=new StackUsingLinkedList();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.Display();
            s.pull();
            s.pull();
            s.Display();
            System.out.println(s.isEmpty());
        }
    }

