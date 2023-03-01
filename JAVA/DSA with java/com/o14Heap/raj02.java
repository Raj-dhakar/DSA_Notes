package com.o14Heap;

import java.util.ArrayDeque;
import java.util.Queue;

public class raj02 {

    public static void main(String[] args) {


        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        PrintHeap(BuildMaxHeap(arr, arr.length));
        PrintHeap(BuildMinHeap(arr, arr.length));
    }

    public static raj01.Heap.Node BuildMaxHeap(int[] arr, int n){
        // The time complexity will be O(N) Better than O(NlogN)

        // index of last node with  leaf node
        int startIdx=(n/2)-1;

        // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for(int j=startIdx;j>=0;j--){
            Maxheapify(arr,n,j);
        }
        // array is converted into heap now build the heap
       return Build(arr,0);
    }
    public static raj01.Heap.Node BuildMinHeap(int[] arr, int n){
        // The time complexity will be O(N) Better than O(NlogN)

        // index of last node with  leaf node
        int startIdx=(n/2)-1;

        // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for(int j=startIdx;j>=0;j--){
            Minheapify(arr,n,j);
        }
        // array is converted into heap now build the heap
        return Build(arr,0);
    }

    private static raj01.Heap.Node Build(int[] arr,int i) {

        raj01.Heap.Node node=null;

//        if(i<arr.length) {
//            if (arr[i] == null) {
//                return null;
//            }
//        }
        if(i<arr.length) {
            node = new raj01.Heap.Node(arr[i]);

            node.left=Build(arr,2*i+1);
            node.right=Build(arr,2*i+2);
        }
        else i=0;
        return node;
    }

    public static void Maxheapify(int[] arr, int n, int i) {

        int larger=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[larger])
            larger=left;
        if(right<n && arr[right]>arr[larger])
            larger=right;

        if(larger!=i){
            int swap=arr[i];
            arr[i]=arr[larger];
            arr[larger]=swap;

            Maxheapify(arr,n,larger);
        }
    }

    public static void Minheapify(int[] arr, int n, int i) {

        int larger=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]<arr[larger])
            larger=left;
        if(right<n && arr[right]<arr[larger])
            larger=right;

        if(larger!=i){
            int swap=arr[i];
            arr[i]=arr[larger];
            arr[larger]=swap;

            Minheapify(arr,n,larger);
        }
    }

    public static void PrintHeap(raj01.Heap.Node  root){
        Queue<raj01.Heap.Node> q=new ArrayDeque<>();

        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                raj01.Heap.Node cur=q.poll();
                System.out.print(cur.val+" ");
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
            }
            System.out.println();
        }
    }
}
