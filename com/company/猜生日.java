package com.company;

import java.util.Calendar;

public class 猜生日 {
    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();
        int sum = 0;
        start.set(Calendar.YEAR,2012);
        start.set(Calendar.MONTH,2);
        start.set(Calendar.DATE,12);
        while (true){
            start.add(Calendar.DATE,-1);
            int A = start.get(Calendar.YEAR);
            int B = start.get(Calendar.MONTH)+1;
            int C = start.get(Calendar.DATE);
            String b;
            String c;
            if (B<10){
                b = "0"+B;
            }
            else{
                b = ""+B;
            }
            if (C<10){
                c = "0"+C;
            }
            else{
                c = ""+C;
            }
            String s = A+""+b+""+c;
            int panduan = Integer.valueOf(s);
            if (panduan%2012==0 && panduan%3==0 && panduan%12==0&&B==6){
                System.out.println(s);
                break;
            }
        }
    }
}
