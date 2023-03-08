package Onlineassesment.leetcode;
import java.util.*;
class raj01 {

    public static void main(String[] args) {
//        System.out.println(getSmellestNumber(27));
//        System.out.println(findMaxDistance(new int[]{1,5,5,2,1}));
//        System.out.println(findMaxDistance(new int[]{2,6,8,5}));
//        int[] arr={1,2,3,3,3,3,3,4,5,7};
//        System.out.println(Arrays.binarySearch(arr,6)+1);
//        int[][] arr1={{0,1,0,0},{0,1,1,0},{0,1,1,0},{1,0,0,1}};
//        island(arr1);
//        for(int i=0;i<arr1.length;i++)
//        {
//            for(int j=0;j<arr1[0].length;j++){
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }
        long a=34,b=345;
        System.out.println(a/b);
    }





//    Given an integer N, return the smallest non-negative number whose individual digits sum upto N.


    static public int getSmellestNumber(int num){
        int noOfNines= num/9;
        int res= num%9;
        while(noOfNines > 0){
            res= res*10 + 9;
            noOfNines--;
        }
        
        return res;
    }

//    There are N block from 0 to N-1. A couple of frogs were sitting together on one block, They had a quarrel and need to jump away
//    from one another. The frogs can only jump to another block if the height of the other block is greater than equal to the current one.
//    You need to find the longest possible distance that they can possible create between each other, if they also choose to sit on an optimal
//    starting block initially.


//    *** Java O(N) solution ****
/*
We can calculate LeftMax (from index 0) jump and rightMax (from index N) jump at each index i;
LeftMax -> Number of increasing element left to ith element.
RightMax -> Number of increasing element right to ith element.
*/

    static int findMaxDistance(int[] arr){
        int N = arr.length;
        int[] leftMax = new int[N];
        int[] rightMax = new int[N];
        int i = 1 ;
        while( i < arr.length ) {
            // previous is greater than current
            if(arr[i] >= arr[i -1]) {
                leftMax[i] = leftMax[i-1] + 1;
            } else {
                leftMax[i] = 0;
            }
            i++;
        }
        rightMax[N-1] = 0 ;  //
        int j = N-2;
        while( j >= 0 ) {
            // next is greater than current
            if(arr[j] >= arr[j + 1]) {
                rightMax[j] = rightMax[j+1] + 1;
            } else {
                rightMax[j] = 0;
            }
            j--;
        }
        int maxD = 0 ;
        for(int k = 0 ; k < N ; k++ ){
            maxD = Math.max(maxD , leftMax[k] + rightMax[k] + 1);
        }
        return maxD;
    }

  // Given a 2-d array 0 denote water 1 demnote land
//    change all 1 to its corresponding land size
    static public void island(int[][] arr){

        int m= arr.length;
        int n=arr[0].length;

        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1 && !vis[i][j])
                    dfs(i,j,arr,vis,m,n,new int[]{1});
            }
        }
    }

    static private void dfs(int row, int col, int[][] arr, boolean[][] vis,int m,int n,int [] count) {

        vis[row][col]=true;

        int[] x={0,0,1,-1};
        int[] y={1,-1,0,0};

        for(int i=0;i<x.length;i++){
            int dx=row+x[i];
            int dy=col+y[i];

            if(dx>=0 && dx<m && dy>=0 && dy<n && !vis[dx][dy] && arr[dx][dy]==1) {
                count[0]+=1;
                dfs(dx, dy, arr, vis, m, n,count);
            }
        }
        arr[row][col]=count[0];
    }
}