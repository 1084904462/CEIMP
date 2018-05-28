package org.obsidian.ceimp.util;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by BillChen on 2017/8/13.
 */
public class TimeUtil {
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final TimeUtil instance = new TimeUtil();

    private TimeUtil(){}

    public static TimeUtil getInstance(){
        return instance;
    }

    public Integer getThisYear(){
        return Integer.parseInt(simpleDateFormat.format(new Date()).substring(0,4));
    }
}
