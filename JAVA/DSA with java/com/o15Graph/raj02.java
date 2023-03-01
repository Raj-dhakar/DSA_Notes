package com.o15Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class raj02 {

    public static void main(String[] args) {

        int vertex=5;
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<=vertex;i++)
            adj.add(new ArrayList<>());

        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,3,4);
        addEdge(adj,2,4);
        addEdge(adj,2,5);
        addEdge(adj,4,5);

        print(adj);
        System.out.println( BFS(adj,vertex));
        System.out.println(DFS(adj,vertex));
    }

    public static void  addEdge(List<List<Integer>> adj,int u,int v){

        adj.get(u).add(v);
        adj.get(v).add(u); // dont involve this in directed graph
    }

    public static void print(List<List<Integer>> adj){

        for(int i=0;i<adj.size();i++){
            System.out.println("Adjacency list of " + i);
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> BFS(List<List<Integer>> adj ,int v){  // Here v denote number of vertices

        // Consider this as 1 based indexing

        List<Integer> bfs=new ArrayList<>();
        boolean[] vis=new boolean[v+1]; // This si for 0 based indexing
        Queue<Integer> q=new ArrayDeque<>();

        // We go to every node and ask for its neighbour
        q.add(1);  // First put the source data in queue
        vis[1]=true;

        while (!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);

            for(Integer it: adj.get(node)){  // now call for neighbour and put them in queue
                if(vis[it]==false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

    public static List<Integer> DFS(List<List<Integer>> adj, int v){
        boolean[] vis=new boolean[v+1];
        vis[0]=true;
        List<Integer> lis=new ArrayList<>();
        dfsOFGraph(1,vis,adj,lis);

        return lis;
    }

    private static void dfsOFGraph(int node, boolean[] vis, List<List<Integer>> adj, List<Integer> lis) {

        vis[node]=true;
        lis.add(node);

        for(Integer it:adj.get(node)){
            if(vis[it]==false)
                dfsOFGraph(it,vis,adj,lis);
        }
    }
}
