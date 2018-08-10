package cn.day14_DateFormat.itcast_01;

import java.util.Date;

/**
 * Created by Gypsophila on 2018/4/11.
 *
 * Date:精确到毫秒
 * 构造方法：
 *      Date():
 *      Date(long date)根绝给定的毫秒值创建日期对象
 *
 */
public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("d:"+d);
    }
}
