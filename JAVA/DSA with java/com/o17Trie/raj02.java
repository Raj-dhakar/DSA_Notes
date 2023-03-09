package com.o17Trie;

public class raj02 {

    public static void main(String[] args) {

        Trie2 trie=new Trie2();
        trie.insert("apple");
        trie.insert("apple");
        trie.insert("apps");
        trie.insert("apps");
        trie.erase("apps");

        System.out.println(trie.countWordStartingWith("app"));
        System.out.println(trie.countWordEqualTo("apps"));

    }
   static class Trie2{
        class Node{
            Node[] links=new Node[26];
            int cntEnd=0;
            int cntPrefix=0;

            void put(char ch,Node node){
                links[ch-'a']=node;
            }

            boolean containsKey(char ch){
                return links[ch-'a']!=null;
            }

            Node get(char ch){
                return links[ch-'a'];
            }

            int getEnd(){
                return cntEnd;
            }

            int getPrefix(){
                return cntPrefix;
            }

            void increaseEnd(){
                cntEnd++;
            }
            void increasePrefix(){
                cntPrefix++;
            }

            void decreaseEnd(){
                cntEnd--;
            }

            void decreasePrefix(){
                cntPrefix--;
            }
        }

        Node root;
        public Trie2(){
            root=new Node();
        }
        void insert(String s){

            Node node=root;

            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);

                if(!node.containsKey(ch))
                    node.put(ch,new Node());

                node=node.get(ch);
                node.increasePrefix();
            }
            node.increaseEnd();
        }

        int countWordEqualTo(String s){

            Node node=root;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(node.containsKey(ch))
                    node=node.get(ch);
                else
                    return 0;
            }
            return node.getEnd();
        }

        int countWordStartingWith(String s){
            Node node=root;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(node.containsKey(ch))
                    node=node.get(ch);
                else
                    return 0;
            }
            return node.getPrefix();
        }

        void  erase(String s){
            Node node=root;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(node.containsKey(ch)){
                    node=node.get(ch);
                    node.decreasePrefix();
                }
                else
                    return ;
            }
            node.decreaseEnd();
        }
    }
}
