package com.company;

import java.util.Calendar;

public class 跑步锻炼 {
    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();
        int sum = 0;
        start.set(Calendar.YEAR,2000);
        start.set(Calendar.MONTH,0);
        start.set(Calendar.DATE,1);

        while(true){
            if (start.get(Calendar.DAY_OF_WEEK)==2 || start.get(Calendar.DATE)==1){
                sum+=2;
            }
            else {
                sum++;
            }
            if (start.get(Calendar.YEAR)==2020&&(start.get(Calendar.MONTH)+1)==10&&start.get(Calendar.DATE)==1){
                break;
            }
            start.add(Calendar.DATE,1);
        }

        System.out.println(sum);
    }
}
