package com.o15Graph;

import java.util.*;

import static com.o15Graph.raj01.DfsOfGraph;

public class raj01 {

    public static void main(String[] args) {

        // For a weighted graph put weight in place of 1
//        int node=5,edge=6;
//        int[][] adj=new int[node+1][node+1]; // for 1 indexed
//        matrix(adj,1,2);
//        matrix(adj,1,3);
//        matrix(adj,3,4);
//        matrix(adj,2,4);
//        matrix(adj,2,5);
//        matrix(adj,4,5);
//        printGraph(adj);
//        System.out.println(BFS(adj,node));
//        System.out.println(DFS(adj,node));

        int node=7;
        int[][] adj=new int[node+1][node+1];
         matrix(adj, 1, 2);
         matrix(adj,1,3);
        matrix(adj,3,4);
        matrix(adj,2,5);
        matrix(adj,3,6);
        matrix(adj,6, 7);
        matrix(adj,5,7);
        System.out.println(BFS(adj,7));
        System.out.println(DetectCycleBFS(adj,node));
        System.out.println(DetectCycleDFS(adj,node));
    }

    static class Pair{
        int node;
        int prev;

        Pair(int node,int prev){
            this.node=node;
            this.prev=prev;
        }
    }

    private static boolean DetectCycleDFS(int[][] adj, int node) {

        boolean[] vis=new boolean[node+1];
        vis[0]=true;
        for(int i=0;i< adj.length;i++)
        {
            for(int j=0;j< adj[i].length;j++)
            {
                if(adj[i][j]==1 && !vis[i]) {
                    return CycleDFS(adj, vis, new Pair(i, -1));
                }
            }
        }
        return false;
    }

    private static boolean CycleDFS(int[][] adj, boolean[] vis, Pair top) {
        vis[top.node]=true;
        for (int k=0;k<adj[top.node].length;k++)
        {
            if(adj[top.node][k]==1 && !vis[k]){
              return   CycleDFS(adj,vis,new Pair(k, top.node));}

            if (adj[top.node][k]==1 && top.prev!=k){
                System.out.println(Arrays.toString(vis));
                return true;}
        }
        return false;
    }

    public static boolean DetectCycleBFS(int[][] adj, int node){
        // using BFS traversal to detect cycle ina graph
        boolean[] vis=new boolean[node+1];
        vis[0]=true;
        for(int i=0;i< adj.length;i++)
        {
            for(int j=0;j<adj[i].length;j++)
            {
                if(adj[i][j]==1 && !vis[i])
                    return cycle(adj,vis,node,i,j);
            }
        }
        return false;
    }

    private static boolean cycle(int[][] adj, boolean[] vis, int node, int i, int j) {

        Queue<Pair> q=new ArrayDeque<>();
        q.offer(new Pair(i,-1));

        while (!q.isEmpty()){
            Pair top=q.poll();
            vis[top.node]=true;

            for(int k=0;k<adj[top.node].length;k++)
            {
                if(adj[top.node][k]==1 && !vis[k]) {
                    q.offer(new Pair(k, top.node));
                    continue;
                }
                else if(adj[top.node][k]==1 && top.prev!=k) {
                    System.out.println(top.node+" "+k);
                    return true;
                }
            }
        }
        return false;
    }


    //Graph representation using matrix
   static public void matrix(int[][] adj,int u,int v){

//        edge u--v
        adj[u][v]=1;
        adj[v][u]=1; // for directed remove this one


/*        edge u--v
*       adj[u][v]=1;
*       adj[v][u]=1;
*/
    }

   static public void printGraph(int[][] adj){

        for(int i=0;i<adj.length;i++){
            for(int j=0;j<adj[i].length;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static List<Integer> BFS(int[][] adj,int v){

        List<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[v+1]; // Here v denotes nu,ber of vertices

        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);  // as I already know about the source data
        visited[1]=true;

        while (!q.isEmpty()){

            Integer vis=q.poll();
            bfs.add(vis);

            for(int i=0;i<=v;i++){
                if(adj[vis][i]==1 && (!visited[i])){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        return bfs;
    }

    public static List<Integer> DFS(int[][] adj,int vertex){
        List<Integer> lis=new ArrayList<>();
        boolean[] vis=new boolean[vertex+1];
        vis[0]=true;

        DfsOfGraph(lis,1,vis,adj);

        return lis;
    }

    public static void   DfsOfGraph(List<Integer> lis,int start,boolean[] vis,int[][] adj){

        lis.add(start);
        vis[start]=true;

        for (int i=0;i<adj[start].length;i++){
            if(adj[start][i]==1 && (!vis[i])){
                DfsOfGraph(lis,i,vis,adj);
            }
        }
    }
}
