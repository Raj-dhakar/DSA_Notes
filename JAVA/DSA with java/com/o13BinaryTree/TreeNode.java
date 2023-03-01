package com.o13BinaryTree;


 public class TreeNode {

    int val;
 TreeNode left;

    TreeNode right;


    TreeNode() {
    }


    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
 this.val = val;
 this.left = left;
 this.right = right;
 }
}
class Solution {
    public int sumRootToLeaf(TreeNode root) {
       
        return ANS(root,"");
    }
    
    public int ANS(TreeNode root,String s)
    {
        if(root==null){
            return 0;
        }
        int left=ANS(root.left,s+root.val);
         
        int right=ANS(root.right,s+root.val);
        
        
        return Integer.parseInt(s,2);
    }

    public static void main(String[] args) {

    }
}