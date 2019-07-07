package com.starfall.thread.demo13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo13
 * @className Tools
 * @date 2019/7/7 23:47
 * @description Tools
 */
public class Tools {
    public static final String PATTER="yyyy-MM-dd HH:mm:ss";
    public static Date getDate(String time, String pattern) {
        Date date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            date = dateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String getDateFomatter(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(PATTER);
        String format = dateFormat.format(date);
        return format;
    }
}
