package com.o8_4BackTracking;

import java.util.*;

public class N_Queen {

    public static void main(String[] args) {

        List<List<String>> list=new ArrayList<>();

        list=NQueen(4);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }

    private static  List<List<String>> NQueen(int n) {

        List<List<String>> ans=new ArrayList<>();

        char[][] safe=new char[n][n];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                safe[i][j]='.';
            }
        }
        f(0,ans,safe);


        return ans;
    }

    private static int  f(int row, List<List<String>> ans,char[][] safe) {
        if(row== safe.length){
           ans.add( display_board(safe));
            return 1;
        }

        int count=0;
        for(int col=0;col<safe.length;col++){

            if(isSafe(row,col,safe)){
                safe[row][col]='Q';
                count+=f(row+1,ans,safe);
                safe[row][col]='.';
            }
        }
        return count;
    }

    private static List<String> display_board(char[][] safe) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<safe.length;i++){
            String add=new String(safe[i]);
            ans.add(add);

            Collections.sort(ans, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return 0;
                }
            });
        }
        return ans;
    }

    private static boolean isSafe(int row, int col,char[][] safe) {

        // first check for verical
        for(int i=row-1;i>=0;i--){
            if(safe[i][col]=='Q')
                return false;
        }
        // check for left diagonal
        int maxLeft=Math.min(row,col);

        for(int i=1;i<=maxLeft;i++){
            if(safe[row-i][col-i]=='Q')
                return false;
        }

        // check for right diagnoal
        int maxRight=Math.min(row, safe.length-col-1);

        for(int i=1;i<=maxRight;i++){
            if(safe[row-i][col+i]=='Q')
                return false;
        }
        return true;
    }
}
