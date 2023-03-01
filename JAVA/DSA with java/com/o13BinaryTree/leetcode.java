package com.o13BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class leetcode {

    public static void main(String[] args) {
//      BT2 obj=new BT2();
//      int[] node={3,9,-1,-1,20,15,-1,-1,7,-1,-1};
//      BT2.Node root= obj.createTreearray(node);
//        System.out.println(depth(0,0,root));
      List<Integer> list=new ArrayList<>();
      list.add(1);
      list.add(2);
    }
    //104 MAX DEPTH
   static public int depth(int lh, int rh, BT2.Node root){
       if(root==null)  // when we find null we need to return 0;
           return 0;
       System.out.println("lh");
       lh=  depth(1+lh,rh,root.left);
       System.out.println("rh");
       rh= depth(lh,rh+1,root.right);
       System.out.println(lh+" "+rh);
       return Math.max(lh,rh)+1;   // when function return it must return 1 to add the hight;
   }

    // check for balanced binary tree

    static boolean isBalanced(BT2.Node root){

        // find hight first;
        return false;
    }
}
