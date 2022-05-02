package com.company;

public class 前缀树 {
    public static void main(String[] args) {

    }
}
class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode p = root;
        for (int i = 0;i<word.length();i++){
            int now = word.charAt(i) - 'a';
            if (p.node[now]==null){
                p.node[now] = new TrieNode();
            }
            p = p.node[now];
        }
        p.is_end = true;
    }

    public boolean search(String word) {
        TrieNode p = root;
        for (int i = 0;i<word.length();i++){
            int now = word.charAt(i) - 'a';
            if (p.node[now]==null){
                return false;
            }
            p = p.node[now];
        }
        return p.is_end;
    }

    public boolean startsWith(String prefix) {
        TrieNode p = root;
        for (int i = 0;i<prefix.length();i++){
            int now = prefix.charAt(i) - 'a';
            if (p.node[now]==null){
                return false;
            }
            p = p.node[now];
        }
        return true;
    }
}
class TrieNode{
    boolean is_end;
    TrieNode node[] = new TrieNode[26];
    TrieNode(){
        is_end = false;
        for (int i = 0;i<node.length;i++){
            node[i] = null;
        }
    }
}
