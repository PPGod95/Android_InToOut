package com.example.second.method;

import java.text.SimpleDateFormat;

/**
 * Created by Haoran Peng on 2020/12/27.
 */
public class Date {
    public static String getNowTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new java.util.Date());
    }


}
