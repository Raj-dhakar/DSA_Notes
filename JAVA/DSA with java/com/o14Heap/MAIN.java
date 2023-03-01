package com.o14Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MAIN {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();  //this is known as Min Heap
        pq.add(3);
        pq.add(2);
        pq.add(1);
        System.out.println(pq);  // This gives level order of Heap

        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());  //this is known as Min Heap
        pq1.add(3);
        pq1.add(2);
        pq1.add(1);
        System.out.println(pq1);  // This gives level order of Heap
    }
}
