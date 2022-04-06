package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class 时间显示 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = sc.nextLong();

//        BigInteger s = BigInteger.valueOf();

        long day = 24*60*60*1000;
        long hours = 60*60*1000;
        long min = 60*1000;
        long sec = 1000;

        long shengxia = sum%day;
        long dayhours = shengxia/hours;
        long daymin = (shengxia%hours)/min;
        long daysec = (shengxia%min)/sec;

        String Sday,Smin,Ssec;
        if (dayhours<10){
            Sday = "0"+dayhours;
        }
        else{
            Sday = ""+dayhours;
        }

        if (daymin<10){
            Smin = "0"+daymin;
        }
        else{
            Smin = ""+daymin;
        }

        if (daysec<10){
            Ssec = "0"+daysec;
        }
        else{
            Ssec = ""+daysec;
        }
        System.out.println(Sday+":"+Smin+":"+Ssec);

    }
}
