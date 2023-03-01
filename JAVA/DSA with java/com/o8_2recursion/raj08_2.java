package com.o8_2recursion;
import java.util.*;

public class raj08_2 {
   public static void main(String[] args){
        List<List<Integer>> list=new ArrayList<>();
        PermutationArray(new int[]{1,2,3},list,new ArrayList<>(),0);
      System.out.println(list);
   }

   static public void PermutationArray(int[] nums,List<List<Integer>>list,List<Integer> permutation,int start)
   {
             if(permutation.size()== nums.length){

                list.add(permutation);
                return;
             }

             for (int i=0;i<= permutation.size();i++){
                List<Integer> SubList=new ArrayList<>(permutation);
                SubList.add(i,nums[start]);
                PermutationArray(nums,list,SubList,start+1);
             }
   }

   // if contain duplicate
   static public void PermutationArrayDuplicate(int[] nums,List<List<Integer>>list,List<Integer> permutation,int start)
   {
      if(permutation.size()== nums.length){
         if(list.contains(permutation))
            return;
         list.add(permutation);
         return;
      }

      for (int i=0;i<= permutation.size();i++){
         List<Integer> SubList=new ArrayList<>(permutation);
         SubList.add(i,nums[start]);
         PermutationArray(nums,list,SubList,start+1);
      }
   }
}
