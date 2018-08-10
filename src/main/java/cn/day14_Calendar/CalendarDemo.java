package cn.day14_Calendar;

import java.util.Calendar;

/**
 * Created by Gypsophila on 2018/4/11.
 *
 * public int get(int field):返回给定日历字段的值。日历类中的每个日历字段都是静态的成员变量，并且是int类型
 *
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        int year = rightNow.get(Calendar.YEAR);


    }
}
