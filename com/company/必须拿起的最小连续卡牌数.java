package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class 必须拿起的最小连续卡牌数 {
    public static void main(String[] args) {
        int cards[] = {3,4,2,3,4,7};
        System.out.println(minimumCardPickup(cards));
    }
    public static int minimumCardPickup(int[] cards) {
         int min = -1;
         int DP[] = new int[cards.length];
         HashMap<Integer,Integer> ans = new HashMap<>();
         for (int i = 0;i<cards.length;i++){
            if (!ans.containsKey(cards[i])){
                ans.put(cards[i],i);
                DP[i] = i;
            }
            else {
                int yuan = ans.get(cards[i]);
                ans.put(cards[i],i);
                if (min == -1){
                    min = i-yuan;
                }
                else if (min>(i-yuan)){
                    min = i-yuan;
                }
            }
         }
         if (min == -1){
             return min;
         }
         else {
             return min+1;
         }
    }
}
