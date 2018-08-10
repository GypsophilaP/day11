package cn.day14_DateFormat.itcast_01.itcast_04;

import java.util.Date;

/**
 * Created by Gypsophila on 2018/4/11.
 */
public class DateUtilDemo {
    public static void main(String[] args) {
        Date d = new Date();

        String s = DateUtil.dateToString(d,"yyyy-MM-dd");
        System.out.println(s);

    }
}
