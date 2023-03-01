package com.o8_3recursion;

public class raj04 {

    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        pathRestriction(0,0,"",board);
    }

    static void pathRestriction(int m, int n, String p,boolean[][] maze) {

        if (m == maze.length-1 && n ==maze[0].length-1 ) {
            System.out.println(p);
            return ;
        }

        if(maze[m][n]==false)
            return;

        if (m < maze.length-1) {
           pathRestriction(m + 1, n, p + "D",maze);
        }

        if (n < maze[0].length-1) {
            pathRestriction(m, n + 1, p + "R",maze);
        }
    }
}
