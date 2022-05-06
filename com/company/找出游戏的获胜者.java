package com.company;

import java.util.ArrayList;
import java.util.List;

public class 找出游戏的获胜者 {
    public static void main(String[] args) {
        System.out.println(findTheWinner(6,5));
    }
    public static int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            list.add(i);
        }
        int start = 0;
        while (list.size()!=1){
            start = (start+k-1)%list.size();
            list.remove(start);
        }
        return list.get(0);
    }
}
