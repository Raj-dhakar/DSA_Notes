//package com.o10_2LinkedList;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Palindrome {
//    public boolean isPalindrome(ListNode head) {
//        if(head==null|| head.next==null)
//            return true;
//        ListNode slow=head;
//        ListNode fast=head;
//        // Find the middle of  Linked list
//        while(fast.next!=null && fast.next.next!=null)
//        {
//            slow=slow.next;
//            fast=fast.next.next;
//
//        }
//        // rev rest of linked list
//        slow.next=rev(slow.next);
//
//        //move slow to right half
//        slow=slow.next;
//        //check left and rigthh half are equal or not
//        while(slow!=null)
//        {
//            if(head.val!=slow.val)
//                return false;
//            head=head.next;
//            slow=slow.next;
//        }
//        return true;
//    }
//
//    private ListNode rev(ListNode head)
//    {
//        ListNode pre=null;
//        ListNode next=null;
//        while(head!=null)
//        {
//            next=head.next;
//            head.next=pre;
//            pre=head;
//            head=next;
//        }
//        return pre;
//    }
//}