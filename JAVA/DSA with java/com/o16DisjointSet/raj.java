package com.o16DisjointSet;


import java.util.*;

class DisjointSet{

    DisjointSet(int n){
        for(int i=0;i<=n;i++){ // this will cover 0 base indexing and 1 base indexing
            size.add(1); // initially eveyone has size 1;
            rank.add(0);
            parent.add(i); // initially everyone is connected to itself
        }
    }
    List<Integer> rank=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();

    List<Integer> size=new ArrayList<>();

    int findUPar(int node){
        if(node== parent.get(node))
            return node; // this tells it is the UParent
        // Here we do Path  Compression so inn future we get it in constant time
        int UParent=findUPar(parent.get(node));
        parent.set(node,UParent);

        return parent.get(node);
    }

    void unionBySize(int u,int v){
        int up_u=findUPar(u);
        int up_v=findUPar(v);

        if(up_u==up_v) return ;// This means both are in same component

        if(size.get(up_u)<size.get(up_v)){
            parent.set(up_u,up_v);
            size.set(up_v, size.get(up_u)+ size.get(up_v));
        }
        else{
            parent.set(up_v,up_u);
            size.set(up_u, size.get(up_u)+ size.get(up_v));
        }

    }

    void unionByRank(int u,int v)
    {
        int up_u=findUPar(u);
        int up_v=findUPar(v);

        if(up_u==up_v) return ;// This means both are in same component

        // if both are not in same component connect lower to higher rank

        if(rank.get(up_u)<rank.get(up_v))
            parent.set(up_u,up_v);
        else if(rank.get(up_v)<rank.get(up_u))
            parent.set(up_v,up_u);
        else {// if both have same rank add any to any
            parent.set(up_v,up_u);
            int URank=rank.get(up_u);
            rank.set(up_u,URank+1);
        }
    }
}
public class raj {

    public static void main(String[] args) {
        DisjointSet ds=new DisjointSet(7);

        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);

        if(ds.findUPar(3)== ds.findUPar(7))
            System.out.println("same");
        else System.out.println("NO");
        ds.unionBySize(3,7);
        if(ds.findUPar(3)== ds.findUPar(7))
            System.out.println("same");
        else System.out.println("NO");

        DisjointSet dset=new DisjointSet(9);

        dset.unionBySize(0,3);
        dset.unionBySize(0,4);
        dset.unionBySize(0,5);
        dset.unionBySize(1,3);
        dset.unionBySize(1,4);
        dset.unionBySize(1,5);
        dset.unionBySize(2,3);
        dset.unionBySize(2,4);
        dset.unionBySize(2,5);

        int ans=0;

        for(int i=0;i<dset.parent.size();i++){
            if(dset.parent.get(i)==i)
                ans++;
        }
        System.out.println(dset.parent);

        System.out.println(9-ans);
    }
}
