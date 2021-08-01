package com.company.ShiJian;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Shijian {
    public static void main(String[] args) {
        /*注意这些都是之前的date方法，目前已经不被推荐*/
        Date date = new Date();
        System.out.println(date.getYear() + 1900);
        System.out.println(date.getMonth() + 1);
        System.out.println(date.getDate());

        System.out.println();
//        转换为String
        System.out.println(date.toString());
//        转换为GMT时区
        System.out.println(date.toGMTString());
//        转换为本地时区
        System.out.println(date.toLocaleString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int dates = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR);
        int moa = c.get(Calendar.AM_PM);
        if (moa == 1) {
            System.out.println("下午");
        } else {
            System.out.println("上午");
        }
        System.out.println(year + "年" + (month + 1) + "月" + dates + "日" + hour + "时");
        c.add(Calendar.YEAR, 0);
        c.add(Calendar.DATE, 0);
        int year1 = c.get(Calendar.YEAR);
        int date1 = c.get(Calendar.DATE);
        System.out.println(year1 + "年" + (month + 1) + "月" + date1 + "日" + hour + "时");
    }
}
