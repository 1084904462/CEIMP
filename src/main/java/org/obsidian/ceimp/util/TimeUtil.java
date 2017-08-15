package org.obsidian.ceimp.util;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by BillChen on 2017/8/13.
 */
public class TimeUtil {

    public static final long YEARSTAMP = 31556926;

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final TimeUtil instance = new TimeUtil();

    private TimeUtil(){
    }

    public static TimeUtil getInstance(){
        return instance;
    }

    public Long getTimeStamp(){
        return new Date().getTime()/1000;
    }

    public String getTime(Long time){
        return simpleDateFormat.format(new Date(time*1000));
    }

    public int getYear(Long time){
        String yearStr = simpleDateFormat.format(new Date(time*1000)).substring(0,4);
        return Integer.parseInt(yearStr);
    }
}
