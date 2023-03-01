package com.o10_2LinkedList;

import java.util.*;

public class LRUCache {

    Node head = new Node(0, 0), tail = new Node(0, 0);
    Map<Integer, Node> map = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            remove(map.get(key));
            if (map.size() == capacity)
                remove(tail.prev);
            insert(new Node(key, value));
        }
    }

    private void insert(Node node) {
        map.put(node.key, node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    class Node {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;

        }
    }

    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',0);
        map.put('a',1);
        System.out.println(map.get('a'));
        int[] ans={1,2,3,4};
        ans[0]++;
        System.out.println(ans[0]);
    }
    }