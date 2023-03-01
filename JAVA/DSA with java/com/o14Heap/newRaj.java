package com.o14Heap;

import java.util.Comparator;
import java.util.PriorityQueue;


     class Pair implements Comparable<Pair>{
        String name;int roll;

        Pair(String name,int roll){
            this.name=name;
            this.roll=roll;
        }
        // Ascending Order
        @Override
        public int compareTo(Pair o) {
            return this.roll-o.roll;

        }
    // Descending order
//         public int compareTo(Pair o) {
//             return o.roll-this.roll;
//
//         }



    public static void main(String[] args) {
//        PriorityQueue<> pq=new PriorityQueue<>();
//        pq.add(new Pair("Raj",2));
//        pq.add(new Pair("Raj",1));
//        pq.add(new Pair("raj",3));
//
//        while(!pq.isEmpty()) {
//            System.out.println(pq.poll().roll);
//        }
    }

    }
