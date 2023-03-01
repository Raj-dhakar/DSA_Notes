package com.Prefix;

import java.util.*;
class Solution {

    public static void main(String[] args) {
//        subsets(new int[]{1,2,2});
        System.out.println(subsets(new int[]{1,2,2}));
    }
   static public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        Permute(ans ,new ArrayList<>(),nums,0);
        
        return ans;
    }
    
 static public void Permute(List<List<Integer>> ans,List<Integer> current,int[] nums,int pos)
  {
      if(pos==nums.length){
          return;
      }
      
      for(int i=0;i<ans.size();i++){
          current =new ArrayList<>(ans.get(i));
          current.add(nums[pos]);
           ans.add(current);
}
      Permute(ans,new ArrayList<>(),nums,pos+1);
      
  }
}