package com.o11Stack;

public class QueueUsingLinkedList {

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
            // if stack is Empty
            if(isEmpty())
                return -1;
            // if only one element is there
            if(head.next==null){
                int val= head.val;

                head=head.next;
                size--;
                return val;
            }

            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            int val= temp.next.val;
            temp.next=temp.next.next;

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
            QueueUsingLinkedList s=new QueueUsingLinkedList();
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

