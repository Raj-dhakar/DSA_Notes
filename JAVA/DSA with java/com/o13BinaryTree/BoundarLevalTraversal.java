package com.o13BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BoundarLevalTraversal {

    public static void main(String[] args) {

        BT2.Node root=Builde(new int[]{1,2,3,-1,4,5,-1,-1,6,-1,-1,-1,7,-1,8,9,10,-1,-1,11,-1,-1,-1});
        PreOrdr(root);
        System.out.println(BoundaryLevel(root));
    }

    public static void PreOrdr(BT2.Node root){
        if(root==null) return;

        System.out.print(root.value+" ");
        PreOrdr(root.left);
        PreOrdr(root.right);
    }
    static int indx;
    static  public BT2.Node Builde(int[] nodes){
      if(nodes[indx]==-1){
          indx++;
          return null;
      }
      BT2.Node root=new BT2.Node(nodes[indx++]);
      root.left=Builde(nodes);
      root.right=Builde(nodes);

      return root;
    }

   static public List<Integer> BoundaryLevel(BT2.Node root)
    {
        List<Integer> list=new ArrayList<>();
        if(root==null) return  list;
        if(isLeaf(root)==false) list.add(root.value);
        leftBoundary(root,list);
        leafBoundary(root,list);
        rightBoundary(root,list);

        return list;
    }

    private static void rightBoundary(BT2.Node root, List<Integer> list) {
        BT2.Node cur= root.right;
        ArrayList<Integer> tmp=new ArrayList<>();

        while (cur!=null){
            if(isLeaf(cur)==false) list.add(cur.value);
            if(cur.right!=null) cur=cur.right;
            else cur=cur.left;
        }
        int i;
        for(i=tmp.size()-1;i>=0;i--){
            list.add(tmp.get(i));
        }
    }

    private static void leafBoundary(BT2.Node root, List<Integer> list) {
        if(isLeaf(root)) {
            list.add(root.value);
            return;
        }
        if(root.left!=null) leafBoundary(root.left,list);
        if(root.right!=null) leafBoundary(root.right,list);
    }

    private static void leftBoundary(BT2.Node root, List<Integer> list) {
        BT2.Node cur=root.left;
        while(cur!=null){
            if(isLeaf(cur)==false)  list.add(cur.value);
            if(cur.left!=null) cur=cur.left;
            else cur=cur.right;
        }
    }

    public static boolean isLeaf(BT2.Node root){

        return root.left==null && root.right==null;
    }
}
