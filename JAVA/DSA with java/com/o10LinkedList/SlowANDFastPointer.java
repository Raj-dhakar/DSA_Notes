package com.o10LinkedList;

public class SlowANDFastPointer {

    public static void main(String[] args) {

    }
}


//        public LL.Node detectCycle(LL.Node head) {
//            LL.Node slow=head;
//            LL.Node fast=head;
//            while(fast!=null && fast.next!=null)
//            {
//                slow=slow.next;
//                fast=fast.next.next;
//                if(slow==fast)
//                    break;
//            }
//            return slow;


    //Length of the cycle
//    public int detectCycle(ListNode head) {
//        ListNode slow=head;
//        ListNode fast=head;
//        while(fast!=null && fast.next!=null)
//        {
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast) {  //once u reach the  cycle u just need to find the length
//                ListNode temp=slow;
//             int length=0;
//            do{   // as it will stop at first if we use while
//                temp=temp.next;
//                length++;
//            }while(temp!=slow);
//                return length
//            }
//        }
//
//    }
//}
//
//
