package com.o14Heap;
import java.util.*;
class Solution2 {
   static public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map=new TreeMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int[] ans=new int[k];
        for(int i=0;i<ans.length;i++){
            ans[i]=map.get(3);
        }
        return ans;
    }

    public static void main(String[] args) {
        Map<Integer,Integer> map=new TreeMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        System.out.println(map.get(2));
    }
}