package com.haut.promotion.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //timeManager();
        String a = "1234-56-78T89a01b";
        System.out.println(a.substring(1,9));
    }

    private static void timeManager() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date a = null;
        Date b = null;
        try {
            a = simpleDateFormat.parse("2000-10-10T20:00".replace("T"," "));
            b = simpleDateFormat.parse("2000-10-10T20:00".replace("T"," "));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(a);
        System.out.println(b);
        int c = (int) (a.getTime()-b.getTime());
        if (c>0){
            System.out.println("时间有差别");
        }else if (c==0){
            System.out.println("时间相同");
        } else {
            System.out.println("小于");
        }
    }
}
