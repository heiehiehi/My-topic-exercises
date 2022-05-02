package com.company;

import java.util.Stack;

public class 基本计算器2 {
    public static void main(String[] args) {
        String s = "1*2-3/4+5*6-7*8+9/10";
        System.out.println(calculate(s));
    }
    public static int calculate(String s) {
        Stack<Integer> number = new Stack<>();
        Stack<Character> fangfa = new Stack<>();
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                continue;
            }
            if (s.charAt(i)=='+'){
                i++;
                while (s.charAt(i)==' '){
                    i++;
                }

                String temp = "";
                while (i<s.length()&&s.charAt(i)!='-'&&s.charAt(i)!='+'&&s.charAt(i)!='*'&&s.charAt(i)!='/'&&s.charAt(i)!=' '){
                    temp = temp+s.charAt(i);
                    i++;
                }
                i--;
                int news = Integer.valueOf(temp);
                number.add(news);
            }
            else if (s.charAt(i)=='-'){
                i++;
                while (s.charAt(i)==' '){
                    i++;
                }

                String temp = "";
                while (i<s.length()&&s.charAt(i)!='-'&&s.charAt(i)!='+'&&s.charAt(i)!='*'&&s.charAt(i)!='/'&&s.charAt(i)!=' '){
                    temp = temp+s.charAt(i);
                    i++;
                }
                i--;
                int news = Integer.valueOf("-"+temp);
                number.add(news);
            }
            else if (s.charAt(i)=='*'){
                if (s.charAt(i+1)==' '){
                    i++;
                }

                i++;
                String temp = "";
                while (i<s.length()&&s.charAt(i)!='-'&&s.charAt(i)!='+'&&s.charAt(i)!='*'&&s.charAt(i)!='/'&&s.charAt(i)!=' '){
                    temp = temp+s.charAt(i);
                    i++;
                }
                i--;

                int news = number.pop()*Integer.valueOf(temp);
                number.add(news);
            }
            else if (s.charAt(i)=='/'){
                if (s.charAt(i+1)==' '){
                    i++;
                }

                i++;
                String temp = "";
                while (i<s.length()&&s.charAt(i)!='-'&&s.charAt(i)!='+'&&s.charAt(i)!='*'&&s.charAt(i)!='/'&&s.charAt(i)!=' '){
                    temp = temp+s.charAt(i);
                    i++;
                }
                i--;

                int news = number.pop()/Integer.valueOf(temp);
                number.add(news);
            }
            else {
                String temp = "";
                while (i<s.length()&&s.charAt(i)!='-'&&s.charAt(i)!='+'&&s.charAt(i)!='*'&&s.charAt(i)!='/'&&s.charAt(i)!=' '){
                    temp = temp+s.charAt(i);
                    i++;
                }
                i--;
                int news = Integer.valueOf(temp);
                number.add(news);
            }
        }

        int sum = 0;
        while (!number.isEmpty()){
            sum += number.pop();
        }
        System.out.println(number.toString());
        return sum;
    }
}
