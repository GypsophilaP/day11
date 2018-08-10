package cn.day14_DateFormat.itcast_01.itcast_02;

import java.util.Date;

/**
 * Created by Gypsophila on 2018/4/11.
 */
public class DateDemo {
    public static void main(String[] args) {
        //创建对象
        Date d = new Date();

        long time = d.getTime();
        System.out.println(time);

        System.out.println(d);
        //设置时间

        d.setTime(1000);
        System.out.println("d" + d);
    }
}
