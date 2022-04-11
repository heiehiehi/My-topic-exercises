package com.company;

import java.util.Scanner;

public class 回文日期1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        String ABAB = String.valueOf(data/10000);
        String ans1 = ABAB;
        while(true){

            int day = Integer.valueOf(ans1.charAt(1)+""+ans1.charAt(0));
            int month = Integer.valueOf(ans1.charAt(3)+""+ans1.charAt(2));
            if (month == 1||month==3||month==5||month==7||month==8||month==10||month==12){
                if (day>=1&&day<=31){
                    String AB = ans1 + String.valueOf(new StringBuilder(ans1).reverse());
                    if (Integer.valueOf(AB)>data){
                        break;
                    }
                }
            }
            else if (month == 2){
                if (day>=1&&day<=28){
                    String AB = ans1 + String.valueOf(new StringBuilder(ans1).reverse());
                    if (Integer.valueOf(AB)>data){
                        break;
                    }
                }
            }
            else if (month == 4||month == 6||month==9|month==11){
                if (day>=1&&day<=30){
                    String AB = ans1 + String.valueOf(new StringBuilder(ans1).reverse());
                    if (Integer.valueOf(AB)>data){
                        break;
                    }
                }
            }
            ans1 = String.valueOf(Integer.valueOf(ans1)+1);

        }
        String AB = ans1 + String.valueOf(new StringBuilder(ans1).reverse());
        System.out.println(Integer.valueOf(AB));


        String Data = String.valueOf(data);
        String ans2 = String.valueOf(Integer.valueOf(Data.substring(0,2)));
        while (true){
            String ABB = ans2.charAt(1) +""+ ans2.charAt(0);
            if (Integer.valueOf(ABB)<=12&&Integer.valueOf(ABB)>=1){
                break;
            }
            ans2 = String.valueOf(Integer.valueOf(ans2)+1);
        }

        ans2 += ans2;
        String ABAB2 = ans2;
        for (int i = 0;i<ABAB2.length();i++){
            ans2 = ans2 + ABAB2.charAt(ABAB2.length()-1-i);
        }


        if (Integer.valueOf(ans2)>data){
            System.out.println(Integer.valueOf(ans2));
        }
        else {
            Data = String.valueOf(data);
            ans2 = String.valueOf(Integer.valueOf(Data.substring(0,2))+1);
            while (true){
                String ABB = ans2.charAt(1) +""+ ans2.charAt(0);
                if (Integer.valueOf(ABB)<=12&&Integer.valueOf(ABB)>=1){
                    break;
                }
                ans2 = String.valueOf(Integer.valueOf(ans2)+1);
            }

            ans2 += ans2;
            ABAB2 = ans2;
            for (int i = 0;i<ABAB2.length();i++){
                ans2 = ans2 + ABAB2.charAt(ABAB2.length()-1-i);
            }
            System.out.println(Integer.valueOf(ans2));
        }
    }
}
