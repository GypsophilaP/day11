package cn.day19_Exception.cn.itcast_01.cn.itcast_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gypsophila on 2018/8/8.
 *
 * 在try里面发现问题后,jvm会帮我们生成一个一场对象,然后把这个对象跑出,和catch里面的类进行匹配
 * 如果该对象是某个类型的,就会执行该catch里面的处理信息
 *
 * 异常中要了解的几个方法
 * getMessage 返回消息字符串
 * printStackTrace
 *
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date d = sdf.parse(s);
        }catch (ParseException e){ //PraseException e = new ParseException()
            e.printStackTrace();
        }

    }
}
