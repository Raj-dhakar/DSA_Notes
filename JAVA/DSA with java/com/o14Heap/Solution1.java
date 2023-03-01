package com.o14Heap;
import java.util.*;
class Solution1 {
   static private class Pair implements Comparable<Pair> {
        int idx;
        int diff;
        
        Pair(int idx, int diff) {
            this.idx = idx;
            this.diff = diff;
        }
        
        public int compareTo(Pair other) {
            if(this.diff==other.diff)
            {
                System.out.println("Comp"+(this.idx-other.idx));
                return this.idx-other.idx;}
            {
                System.out.println("Comp"+(this.diff-other.diff));
                return this.diff-other.diff;}
        }
    }
    
  static   public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;++i) {
            pq.add(new Pair(i, Math.abs(arr[i]-x)));
            if(pq.size() > k) pq.remove();
        }  
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()) 
            ans.add(arr[pq.remove().idx]);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int a=map.get(0);
       System.out.println(findClosestElements(new int[]{1,2,3,4,5},4,3));
    }
}