package Code_Snipper;
import java.util.*;

class DisjointSet{

        DisjointSet(int n){
            for(int i=0;i<=n;i++){ // this will cover 0 base indexing and 1 base indexing
                size.add(1); // initially eveyone has size 1;
                parent.add(i); // initially everyone is connected to itself
            }
        }

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
            } else{
                parent.set(up_v,up_u);
                size.set(up_u, size.get(up_u)+ size.get(up_v));
            }

        }

    }