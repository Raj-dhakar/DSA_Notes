package com.o11Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

    //Best answer
//     for(int i=nums2.length-1;i>=0;i--)
//    {
//
//        if(stack.isEmpty())
//        {
//            next[i]=-1;
//            stack.push(nums2[i]);
//            continue;
//        }
//        while(stack.peek()<=nums2[i])
//        {
//            stack.pop();
//            if(stack.isEmpty())
//                break;
//        }
//        if(stack.isEmpty())
//        {
//            next[i]=-1;
//            stack.push(nums2[i]);
//            continue;
//        }
//        next[i]=stack.peek();
//        stack.push(nums2[i]);
//    }

    static int[] Nextgreater(int[] arr){
        // here missing one case when 2 values are equals manage in next case
        int[] ans=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i= arr.length-1;i>=0;i--){
            if(stack.isEmpty())
            {
                ans[i]=-1;
                stack.push(arr[i]);
                continue;
            }
            if(stack.peek()>arr[i]){
                ans[i]=stack.peek();
                stack.push(arr[i]);
            }
            else{

                while(stack.peek()<arr[i]){
                    stack.pop();

                    if(stack.isEmpty()) {
                       ans[i]=-1;
                        break;
                    }
                    if(stack.peek()>arr[i])
                    {
                        ans[i]=stack.peek();
                        break;
                    }
                }

                stack.push(arr[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[] arr={5,6,7,1,2,3};
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(Nextgreater(arr)));
    }
}

//   [2,2,5]
class solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;
        int len=0;
        // length of the linkedlist
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        // store values in array to find next greatest elemnt
        int[] arr=new int[len];temp=head;
        for(int i=0;i<len;i++)
        {
            arr[i]=temp.val;
            temp=temp.next;
        }
        // store ans in an array using stack
        int[] ans=new int[len];
        for(int i=len-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                ans[i]=0;
                stack.push(arr[i]);
                continue;
            }

            if(stack.peek()>arr[i])
            {
                ans[i]=stack.peek();
                stack.push(arr[i]);
                continue;
            }
            else
            {
                while(stack.peek()<=arr[i])
                {
                    stack.pop();
                    if(stack.isEmpty())
                    {
                        break;
                    }
                }

                if(stack.isEmpty())
                {
                    ans[i]=0;
                    stack.push(arr[i]);
                    continue;
                }
                if(stack.peek()==arr[i])
                {
                    ans[i]=0;
                    stack.push(arr[i]);
                    continue;
                }

                ans[i]=stack.peek();
                stack.push(arr[i]);
            }
        }
        return ans;
    }
}