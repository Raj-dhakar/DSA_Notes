package com.o8_2recursion;

import java.util.*;

public class raj07 {

    public static void main(String[] args) {
        int[] a={1,2,3};
        List<List<Integer>> ans=subset(a);
        for(List<Integer> list:ans)
        {
            System.out.println(list);
        }
        int[] a1={2,1,2};
        List<List<Integer>> ans1=subsetDuplicate(a1);
        for(List<Integer> list:ans1)
        {
            System.out.println(list);
        }
        List<List<Integer>> ans3=new ArrayList<>();
        System.out.println("subarray_subsequence");
        System.out.println( subarray_substring(0,new int[]{1,2,3,4,5},new ArrayList<>(),ans3));
//        System.out.println(ans3);
    }
 static int num=0;
    static int  subarray_substring(int indx,int[] arr,List<Integer> curr,List<List<Integer>> ans){

        // base case
        if(indx==arr.length){
            System.out.println((num++)+" "+curr);
            ans.add(new ArrayList<>(curr));
            return 0;
        }

        // take
        curr.add(arr[indx]);
       int Take= 1+subarray_substring(indx+1,arr,curr,ans);
       curr.remove(curr.size()-1);


        // NotTake
        int notTake= 0+subarray_substring(indx+1,arr,curr,ans);

       return notTake+Take;
    }

     static List<List<Integer>> subset(int[] arr)  // continous
     {
         List<List<Integer>> outer=new ArrayList<>();

         outer.add(new ArrayList<>()); // the outer has an empty list

         for(int num :arr)
         {
             int n=outer.size();
             for(int i=0;i<n;i++)
             {
                 List<Integer> internal=new ArrayList<>(outer.get(i));
                 internal.add(num) ;
                 outer.add(internal);
             }
         }

         return outer;
     }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);  // as [2,1,2] is a catch here as it will not see the adjacent element as dupicate so we need to sort the array
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // the outer has an empty list

        int start = 0;
        int end = 0;
        for (int j = 0; j < arr.length; j++) {
            start = 0;
            // if curren and previous element is same ,s=e=1;
            if (j > 0 && arr[j] == arr[j - 1])
                start = end + 1;
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
