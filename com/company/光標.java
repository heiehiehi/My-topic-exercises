package com.company;

public class 光標 {
    public static void main(String[] args) {
       String article = "Hello World";
       int index = 10;
       String ans = deleteText(article,index);
       System.out.println(ans);

    }
    public static String deleteText(String article, int index) {
        if (article.charAt(index)==' '){
            return article;
        }
        int start = 0;
        int end = index;
        for (int i =0;i<=index;i++){
            if (article.charAt(i)==' '){
                start = i+1;
            }
        }
        for (int i = index;i<article.length();i++){
            if (article.charAt(i)==' '){
                end = i;
                break;
            }
            end = i;
        }
        String ans = "";
        if (end==article.length()-1){
            for (int i = 0;i<article.length();i++){
                if (i<start-1||i>end){
                    ans = ans + article.charAt(i);
                }
            }
        }
        else {
            for (int i = 0;i<article.length();i++){
                if (i<start||i>end){
                    ans = ans + article.charAt(i);
                }
            }
        }
        return ans;
    }
}
