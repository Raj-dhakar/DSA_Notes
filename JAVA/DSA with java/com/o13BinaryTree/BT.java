package com.o13BinaryTree;

public class BT {

    static class Node {
        Node left, right;
        int value;

        Node(int value) {
            this.value = value;
        }


        public static void main(String[] args) {

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            System.out.println(root.value);
            System.out.println(root.left.value);
            System.out.println(root.right.value);
        }

    }
}