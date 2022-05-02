package com.company;

import java.util.ArrayList;
import java.util.List;

public class 单词搜索2 {
    public static void main(String[] args) {
        char board[][] = {{'a','b','c'},{'a','e','d'},{'a','f','g'}};
        String words[] = {"eaabcdgfa"};
        System.out.println(findWords(board,words).toString());

    }
    static boolean find = false;
    static Trie root;
    public static List<String> findWords(char[][] board, String[] words) {
        root = new Trie();
        for (int i = 0;i<words.length;i++){
            root.insert(words[i]);
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0;i<words.length;i++){
            for (int m = 0;m<board.length;m++){
                for (int n = 0;n<board[0].length;n++){
                    if (board[m][n]==words[i].charAt(0)){
                        find = false;
                        boolean isuse[][] = new boolean[board.length][board[0].length];
                        DFS(root.root.node[words[i].charAt(0)-'a'], isuse,board,ans,words[i],1,m,n,""+words[i].charAt(0));
                    }
                }
            }
        }
        return ans;
    }
    public static void DFS(TrieNode node,boolean isuse[][],char board[][],List<String> ans,String word,int now,int x,int y,String res){
        if (now == word.length()){
            if (!ans.contains(res)){
                ans.add(res);
                root.insert(res);
                find = true;
            }
            return;
        }
        if (node.node[word.charAt(now)-'a']==null){
            return;
        }
        else {
            node = node.node[word.charAt(now)-'a'];
        }
        String temp;
        isuse[x][y] = true;
        if (x+1<board.length&&board[x+1][y]==word.charAt(now)&&!isuse[x+1][y]&&!find){
            temp = res;
            temp = temp + word.charAt(now);
            DFS(node,isuse,board,ans,word,now+1,x+1,y,temp);
        }
        if (x-1>=0&&board[x-1][y]==word.charAt(now)&&!isuse[x-1][y]&&!find){
            temp = res;
            temp = temp + word.charAt(now);
            DFS(node,isuse,board,ans,word,now+1,x-1,y,temp);
        }
        if (y+1<board[0].length&&board[x][y+1]==word.charAt(now)&&!isuse[x][y+1]&&!find){
            temp = res;
            temp = temp + word.charAt(now);
            DFS(node,isuse,board,ans,word,now+1,x,y+1,temp);
        }
        if (y-1>=0&&board[x][y-1]==word.charAt(now)&&!isuse[x][y-1]&&!find){
            temp = res;
            temp = temp + word.charAt(now);
            DFS(node,isuse,board,ans,word,now+1,x,y-1,temp);
        }
        isuse[x][y] = false;
    }
}
