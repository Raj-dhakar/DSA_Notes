package com.o13BinaryTree;
import java.util.*;

public class BT2 {

    static Scanner sc=null;
    static class Node{
        Node left,right;
        int value;

        Node(int value){
            this.value=value;
        }
    }

    public Node createTree(){

        Node root=null; // initially it is null
        System.out.println("Enter data:");
        int data= sc.nextInt();

        if(data==-1)
            return null;

        root=new Node(data);
        System.out.println("Enter left for "+data);
        root.left=createTree();

        System.out.println("Enter right for "+data);
        root.right=createTree();

        return root;
    }

    int indx=-1;
    public  Node createTreearray(int[] nodes){
        indx++;

        if(nodes[indx]==-1)
            return null;   // as -1 depect null here

        Node root=new Node(nodes[indx]);
        root.left=createTreearray(nodes);
        root.right=createTreearray(nodes);

        return root;
    }
//    public  void PreOrderTraversal(Node root){
//        if(root==null)
//            return;
//        System.out.println(root.value);
//        PreOrderTraversal(root.left);
//        PreOrderTraversal(root.right);
//    }


    //                                     USING RECURSION
    public List<Integer> preorderTraversal(Node root) {   // RootLeftright
        List<Integer> list=new ArrayList<Integer>();

        if(root!=null){
            list.add(root.value);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }

//    public  void InOrderTraversal(Node root){
//        if(root==null)
//            return;
//        InOrderTraversal(root.left);
//        System.out.println(root.value);
//        InOrderTraversal(root.right);
//    }

    public  List<Integer> InOrderTraversal(Node root){
        List<Integer> list=new ArrayList<>();
       if(root!=null){
           list.addAll(InOrderTraversal(root.left));
           list.add(root.value);
           list.addAll(InOrderTraversal(root.right));
       }

        return list;
    }

//    public void PostOrderTraversal(Node root){
//        if(root==null)
//            return ;
//        PostOrderTraversal(root.left);
//        PostOrderTraversal(root.right);
//        System.out.println(root.value);
//    }

    public List<Integer> PostOrderTraversal(Node root){
        List<Integer> list=new ArrayList<>();
        if(root!=null){
            list.addAll(PostOrderTraversal(root.left));
            list.addAll(PostOrderTraversal(root.right));
            list.add(root.value);
        }

        return list;
    }

    public List<List<Integer>> LevelOrderTraversal(Node root){

        Queue<Node> queue=new ArrayDeque<>();  // to store level wise node of tree
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> subList=new ArrayList<>();  // storing values of each node in a level
            int level= queue.size();
            for (int i=0;i<level;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                subList.add(queue.poll().value);
            }
            list.add(subList);
        }
        return list;
    }

    //                     ITERATIVE SOLUTION  (USING STACK)

    public List<Integer> PreOrderIterative(Node root){

        List<Integer> list=new ArrayList<>();
        if(root==null)
            return null;
        Stack<Node> stack=new Stack<>();

        stack.push(root);
        while(!stack.isEmpty()){
            root=stack.pop();
            list.add(root.value);
            if(root.right!=null)
               stack.push(root.right);
            if(root.left!=null)
                stack.push(root.left);
        }
        return list;
    }

    public List<Integer> InOrderIterative(Node root){

        List<Integer> list=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        while(true)
        {
            if(root!=null){
                stack.push(root);
                root=root.left;
            }
            else{
                if(stack.isEmpty())
                    break;
                root=stack.pop();
                list.add(root.value);
                root=root.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
//         PreOrderTraversal(createTree());
//        preorderTraversal(createTree());
     BT2 obj=new BT2();
        int[] nodes={1,2,4,-1,-1,5,6,-1,-1,-1,3,7,-1,-1,8,9,-1,-1,10,-1,-1};
       Node root= obj.createTreearray(nodes);
       //                       USING RECURSION
        System.out.println(obj.preorderTraversal(root));   //DFS
        System.out.println(obj.InOrderTraversal(root));    //DFS
        System.out.println(obj.PostOrderTraversal(root));  //DFS
        System.out.println(obj.LevelOrderTraversal(root)); //BFS
        //                   ITERATICE SOLUTION
        int[] node={1,2,3,-1,-1,4,5,-1,-1,6,-1,-1,7,-1,-1};
        BT2 obj1=new BT2();
        Node root1=obj1.createTreearray(node);
        System.out.println(obj1.PreOrderIterative(root1));
        System.out.println(obj1.InOrderIterative(root1));
    }
}