package com.o15Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public List<Integer> BFS(List<List<Integer>> adj,int v){ // here v is no of vertex

//        as each list store its adjacenty nodes so we will maintain visited array and the near one only

        List<Integer> bfs=new ArrayList<>();
        boolean[] vis=new boolean[v]; // This si for 0 based indexing
        Queue<Integer> q=new ArrayDeque<>();

        q.add(0);  // First put the source data in queue
        vis[0]=true;

        while (!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);

            for (Integer it:adj.get(node)){
                if(vis[it]==false)
                {
                    vis[it]=true;
                    bfs.add(it);
                }
            }
        }

        return bfs;
    }
}
