package com.o14Heap;

import java.util.*;

public class raj01 {


    // we cant change the size of array from functio it must be global for it , otherwise there will be no effect on it
  static   class Heap{

        static class Node{
            int val;
            Node left;
            Node right;

            public Node(int val){
                this.val=val;
            }
        }
        int i=0;
        public Node BuildTree(Integer[] arr,int i){
              Node node=null;

              if(i<arr.length) {
                  if (arr[i] == null) {
                      return null;
                  }
              }
            if(i<arr.length) {
                node = new Node(arr[i]);

                node.left=BuildTree(arr,2*i+1);
                node.right=BuildTree(arr,2*i+2);
            }
            else i=0;
            return node;
        }

        public static Integer[] insert(Integer[] arr, int val){
            int length = arr.length+1;
            Integer[] ans=new Integer[length];
            // copying data in new array
            for(int i=0;i<arr.length;i++){
                ans[i]=arr[i];
            }
            ans[ans.length-1]=val;
            arr=ans;
//            for(int i=0;i< arr.length;i++){
//                System.out.println(arr[i]);
//            }
            int i= arr.length-1;
            System.out.println("size of array "+i);
            while(i>0){
                int parent=i/2;

                if(arr[parent]<arr[i]){
                    swap(arr,parent,i);
                    i=parent;
                }
                else
                    break;
            }
            return arr;
        }

      public static void swap(Integer[] arr, int parent, int i) {

            int temp=arr[i];
            arr[i]=arr[parent];
            arr[parent]=temp;
      }

      public static Integer[] delete(Integer[] arr){
            // we always delete the root node for this thing
               arr[0]=arr[arr.length-1];
               arr= Arrays.copyOfRange(arr,0,arr.length-1);

                // Now just swap the values to maintain heap from up to bottom
          System.out.println(Arrays.toString(arr));
          int lo=0, hi= arr.length-1;
          while(lo<hi){
              int left=2*lo+1;
              int right=2*lo+2;
               if(left> hi || right> hi)
                   return arr;
              int larger =arr[left]>arr[right]? 2*lo+1 : 2*lo+2;
              if(arr[lo]<arr[larger]){
                  swap(arr,larger,lo);
                  lo=larger;
              }
              else return arr;
          }
          return arr;
      }
  }


    public static void LevelOrder(Heap.Node root){
     Queue<Heap.Node> q=new ArrayDeque<>();
     if(root==null) return ;
     q.offer(root);

     while(!q.isEmpty()){
         int size=q.size();

         for(int i=0;i<size;i++){
             Heap.Node curr=q.poll();
             System.out.print(curr.val+" ");
             if(curr.left!=null) q.offer(curr.left);
             if(curr.right!=null) q.offer(curr.right);
         }
         System.out.println();
     }
    }
    public static void main(String[] args) {

        Heap heap=new Heap();
         Integer[] arr=new Integer[]{50,40,45,30,20,35,10};
         Heap.Node root=heap.BuildTree(arr,0);
               LevelOrder(root);
        System.out.println();
        Heap.Node root1=heap.BuildTree( Heap.insert(arr,12),0);
        LevelOrder(root1);
        System.out.println();
        Heap.Node root2=heap.BuildTree( Heap.insert(arr,55),0);
        LevelOrder(root2);
        System.out.println();
        Heap.Node root3=heap.BuildTree( Heap.delete(arr),0);
        LevelOrder(root3);
    }


}
