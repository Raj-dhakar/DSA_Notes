package com.Algorithm;
import java.util.*;

//import static Onlineassesment.leetcode.raj01.dfs;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        int n=values.length;
        Map<String,Map<String,Double>> graph=new HashMap<>();
        double[] ans=new double[queries.size()];

        // Building Graph
        for(int i=0;i<n;i++){

            String a=equations.get(i).get(0),b=equations.get(i).get(1);
            graph.putIfAbsent(a,new HashMap<>());
            graph.putIfAbsent(b,new HashMap<>());

            graph.get(a).put(b,values[i]);
            graph.get(b).put(a,1.0/values[i]);
        }

        // Doing simple DFS HERE

        for(int i=0;i< queries.size();i++){

            String a=queries.get(i).get(0),b=queries.get(i).get(1);
            if(!graph.containsKey(a) || !graph.containsKey(b)) ans[i]=-1.0;
            else{
                Set<String> vis=new HashSet<>();
                double[] key={-1.0};
                dfs(a,b,graph,vis,key,1.0);
                ans[i]=key[0];
            }
        }

        System.out.println(graph);

        return ans;
    }

    private void dfs(String node, String des, Map<String, Map<String, Double>> graph, Set<String> vis, double[] key, double ans) {

        if(vis.contains(node)) return;

        vis.add(node);
        if(node.equals(des)){
            key[0]=ans;
            return;
        }

        for(Map.Entry<String,Double> it:graph.get(node).entrySet()){
            String a=it.getKey();
            double val=it.getValue();
            dfs(a,des,graph,vis,key,ans*val);
        }
    }
}