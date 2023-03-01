package com.o8_4BackTracking;
import java.util.Arrays;
public class raj01 {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        pathRestriction(0,0,"",board);
        pathRestriction1(0,0,"",board,new int[][]{{0,0,0},{0,0,0},{0,0,0}},1);

    }

    static void pathRestriction(int m, int n, String p,boolean[][] maze) {
        // To do so mark all the visited as false if we do not do so it will be in a end else loop
        // so we will mark all the visited place as false;

        if (m == maze.length-1 && n ==maze[0].length-1 ) {
            System.out.println(p);
            return ;
        }

       if(maze[m][n]==false)
           return;

        maze[m][n]=false;

        if (m < maze.length-1) {
            pathRestriction(m + 1, n, p + "D",maze);
        }

        if (n < maze[0].length-1) {
            pathRestriction(m, n + 1, p + "R",maze);
        }
        if(m>0)
            pathRestriction(m-1,n,p+"U",maze);
        if(n>0)
            pathRestriction(m,n-1,p+"L",maze);

        // This line is where the function will be over
        // so before the function gets removed,also remove th changes that were made by that function
        maze[m][n]=true;
    }

    static void pathRestriction1(int m, int n, String p,boolean[][] maze,int[][] path,int step) {
        // To do so mark all the visited as false if we do not do so it will be in a end else loop
        // so we will mark all the visited place as false;

        path[m][n]=step;
        if (m == maze.length-1 && n ==maze[0].length-1 ) {

            for (int[] arr:path){
                System.out.println(Arrays.toString(arr));}
            System.out.println(p);
            return ;
        }

        if(maze[m][n]==false)
            return;

        maze[m][n]=false;


        if (m < maze.length-1) {
            pathRestriction1(m + 1, n, p+"D" ,maze,path,step+1);
        }

        if (n < maze[0].length-1) {
            pathRestriction1(m, n + 1, p+"R" ,maze,path,step+1);
        }
        if(m>0)
            pathRestriction1(m-1,n,p+"R",maze,path,step+1);
        if(n>0)
            pathRestriction1(m,n-1,p+"L",maze,path,step+1);

        // This line is where the function will be over
        // so before the function gets removed,also remove th changes that were made by that function
        maze[m][n]=true;
        path[m][n]=0;
    }
}
