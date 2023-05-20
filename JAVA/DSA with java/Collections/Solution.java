
class Solution {

    int ans=0;
    public int maxMoves(int[][] grid) {

        int m= grid.length,n=grid[0].length;

        for(int i=0;i<m;i++){
            boolean[][] vis=new boolean[m][n];
            dfs(i,0,grid,vis,1,m,n);
            System.out.println(ans);
        }
        return ans;
    }

    private void dfs(int row, int col, int[][] grid, boolean[][] vis,int cnt,int m,int n) {

        vis[row][col]=true;
        ans=Math.max(ans,cnt);

        int[] x={-1,0,1};
        int[] y={0,1,1};

        for(int i=0;i<3;i++){
            int dx=row+x[i];
            int dy=col+y[i];

            if(dx>=0 && dx<m  && dy>=0 && dy<n && !vis[dx][dy] && grid[row][col]<grid[dx][dy] )
                dfs(dx,dy,grid,vis,cnt+1,m,n);
        }
    }
}