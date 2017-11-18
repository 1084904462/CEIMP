package org.obsidian.ceimp.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by BillChen on 2017/8/13.
 */
public class TimeUtil {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    private static final Calendar calendar = Calendar.getInstance();

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

    public Integer getThisYear(){
        String yearStr = simpleDateFormat.format(new Date(this.getTimeStamp()*1000)).substring(0,4);
        return Integer.parseInt(yearStr);
    }

    public Integer getYear(Long time){
        String yearStr = simpleDateFormat.format(new Date(time*1000)).substring(0,4);
        return Integer.parseInt(yearStr);
    }

    public Long getOneDayTimeStamp(String day){
        Date date = null;
        try {
            date = sdf.parse(day);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.setTime(date);
        return calendar.getTimeInMillis()/1000;
    }
}
