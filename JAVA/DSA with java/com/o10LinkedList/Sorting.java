//package com.o10LinkedList;
//
//
//
//  public class Listnode1 {
//      int val;
//      ListNode1 next;
//      ListNode1() {}
//      ListNode1(int val) { this.val = val; }
//      ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
//  }
//
//class Sorting {
//
//    public static void main(String[] args) {
//
//    }
//    public ListNode1 sortList(ListNode1 head) {
//        if(head==null || head.next==null)
//            return head;
//
//        //cut the list into 2 halves
//     ListNode1 prev=null,slow=head,fast=head;
//        while(fast!=null && fast.next!=null)
//        {
//            prev=slow;
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//       prev.next=null;
//
//        // sort 2 list
//        ListNode1 l1=sortList(head);
//        ListNode1 l2=sortList(slow);
//
//        // merge 2 list
//        return merge(l1,l2);
//    }
//
//     ListNode1 merge(ListNode1 l1,ListNode1 l2)
//    {
//         ListNode1 ans=new ListNode1(0),p=ans;
//        while(l1!=null && l2!=null)
//        {
//            if(l1.val<l2.val){
//                p.next=l1;
//                l1=l1.next;
//            }
//            else{
//                p.next=l2;
//                l2=l2.next;
//            }
//            p=p.next;
//        }
//        if(l1!=null){
//            p.next=l1;
//        }
//
//        if(l2!=null)
//            p.next=l2;
//        return ans.next;
//    }
//}