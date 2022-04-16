package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

        List<String> ans = fizzBuzz(15);
        for (String i:ans){
            System.out.println(i);
        }
    }
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            if (i%3==0&&i%5==0){
                ans.add("FizzBuzz");
            }
            else if (i%3==0){
                ans.add("Fizz");
            }
            else if (i%5==0){
                ans.add("Buzz");
            }
            else {
                ans.add(i+"");
            }
        }
        return ans;
    }
}
