package com.o8_3recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class raj03 {

    public static void main(String[] args) {
        

//        System.out.println(uniquePaths(51,9));
        System.out.println(uniquePaths(3,3,""));
        System.out.println(uniquePathsdiagonal(3,3,""));
        String s="12345";
        StringBuilder sb=new StringBuilder();
        sb= new StringBuilder(sb + "a");
        System.out.println(s.substring(0,3));

    }
    // counting path leetode 62
     static int uniquePaths(int m,int n)
     {
         int ans=0;
         if(m==1 || n==1)
             return ans+=1;

        int left= uniquePaths(m-1,n);
        int right= uniquePaths(m,n-1);
        ans=left+right;
         return ans;
     }

    static ArrayList<String> uniquePaths(int m, int n, String p) {
        ArrayList<String> ans = new ArrayList<>();
        if (m == 1 && n == 1) {
            ans.add(p);
            return ans;
        }

        ArrayList<String> list=new ArrayList<>();
        if (m > 1) {
            list.addAll(uniquePaths(m - 1, n, p + "D"));
        }
        ArrayList<String> right ;
        if (n > 1) {
            list.addAll(uniquePaths(m, n - 1, p + "R"));
        }

        return list;
    }

    static ArrayList<String> uniquePathsdiagonal(int m, int n, String p) {
        ArrayList<String> ans = new ArrayList<>();
        if (m == 1 && n == 1) {
            ans.add(p);
            return ans;
        }

        ArrayList<String> list=new ArrayList<>();

        if(m>=1&& n>=1)
        {
            list.addAll(uniquePathsdiagonal(m-1,n-1,p+"D"));
        }
        if (m > 1) {
            list.addAll(uniquePathsdiagonal(m - 1, n, p + "V"));
        }
        ArrayList<String> right ;
        if (n > 1) {
            list.addAll(uniquePathsdiagonal(m, n - 1, p + "H"));
        }

        return list;
    }
}
