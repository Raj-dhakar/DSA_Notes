package com.o8_2recursion;

import java.util.*;

public class raj09 {

    public static void main(String[] args) {

        int[] a={1,2,3,4};
        List<List<Integer>> ans=ArrayPermutation(a);
        System.out.println(ans);
    }

    static List<List<Integer>> ArrayPermutation(int[] arr)
    {
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>()); // the outer has an empty list
        outer.get(0).add(arr[0]);
        System.out.println(outer);
        for(int i=1;i<arr.length;i++)
        {
            int n= outer.size();

                for (int j = 0; j <= n; j++) {
                    List<Integer> inner = new ArrayList<>(outer.get(0));
                    if (j == n) {
                        inner.add(arr[i ]);
                        outer.add(inner);
                    } else {
                        inner.add(j, arr[i ]);
                        outer.add(inner);
                    }
                    System.out.println(inner);
                }
                outer.remove(0);

        }

        return outer;
    }

}
