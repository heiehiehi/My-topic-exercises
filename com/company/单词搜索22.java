package com.company;

import java.util.ArrayList;
import java.util.List;

public class 单词搜索22 {
    public static void main(String[] args) {
        char board[][] = {{'a','b','c'},{'a','e','d'},{'a','f','g'}};
        String words[] = {"ab","abc"};
        System.out.println(findWords(board,words).toString());
    }
    public static List<String> findWords(char[][] board, String[] words) {
        Tire tree = new Tire();
        List<String> ans = new ArrayList<>();
        for (int i = 0;i<words.length;i++){
            tree.insert(words[i]);
        }
        for (int i = 0;i<board.length;i++){
            for (int j = 0;j<board[0].length;j++){
                DFS(board,i,j,tree.root,ans);
            }
        }
        return ans;
    }
    public static void DFS(char[][] board,int x,int y,TireNode node,List<String> ans){
        int dx[] = {1,0,-1,0};
        int dy[] = {0,1,0,-1};

        int cur = board[x][y]-'a';
        if (cur == (0-'a')||node.children[cur]==null){
            return;
        }
        TireNode cur_node = node.children[cur];
        if (cur_node.word!=null){
            if (!ans.contains(cur_node.word)){
                ans.add(cur_node.word);
            }
        }
        char tempchar = board[x][y];
        board[x][y] = 0;
        for (int i=0;i<4;i++){
            int next_x = x+dx[i];
            int next_y = y+dy[i];
            if (isVaild(board,next_x,next_y)){
                DFS(board,next_x,next_y,cur_node,ans);
            }
        }
        board[x][y] = tempchar;

    }
    public static boolean isVaild(char[][] board,int x,int y){
        int m = board.length;
        int n = board[0].length;
        return x>=0 && x<m && y>=0 && y<n && board[x][y]!=0;
    }
    static class Tire{
        TireNode root;
        public Tire(){
            root = new TireNode();
        }
        public void insert(String word){
            TireNode node = root;
            for (int i = 0;i<word.length();i++){
                int now = word.charAt(i)-'a';
                if (node.children[now]==null){
                    node.children[now] = new TireNode();
                }
                node = node.children[now];
            }
            node.word = word;
        }

    }
    static class TireNode{
        String word;
        TireNode[] children;
        public TireNode(){
            word = null;
            children = new TireNode[26];
        }
    }
}
