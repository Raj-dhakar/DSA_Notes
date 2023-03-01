package com.o7BitManipulation;

import java.util.*;

class Solution {

    public static void main(String[] args) {
//        Set<String> set=new HashSet<>();
//
//        set.add("Raj");
//        set.add("Raj");
//
//        System.out.println(set.size());
//        StringBuilder s=new StringBuilder();
//        s.append(1);
//
//        PriorityQueue<Pair> pq=new PriorityQueue<Pair>();
//        pq.offer(new Pair(0,1));
//        pq.offer(new Pair(0,2));
//
//        System.out.println(pq.peek().num2);
        System.out.println(Math.sqrt(7));
    }

    static class Pair implements Comparable<Pair>{
        int num1,num2;
        Pair(int _num1,int _num2){
            num1=_num1;
            num2=_num2;
        }

        public int compareTo(Pair old){
            System.out.println(old.num2);
            if(this.num1> old.num1) return -1;
            else return 1;
        }
    }
}