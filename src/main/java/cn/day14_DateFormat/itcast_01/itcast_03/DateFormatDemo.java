package cn.day14_DateFormat.itcast_01.itcast_03;

import com.sun.org.apache.xpath.internal.SourceTree;
import sun.nio.ch.SelectorImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gypsophila on 2018/4/11.
 *
 * Date -- String (格式化)
 * String -- Date(解析)
 * DateFormat：可以进行日期和字符串的格式化和解析，但是由于是抽象类 所以使用具体的子类SimpleDateFormat
 *  年 y 月 M 日d 时 H 分 m 秒 s
 *
 */
public class DateFormatDemo {
    public static void main(String[] args) {

        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 ： HH：mm：ss");
        System.out.println(sdf.format(d));

        String str = "2008-08-08 12:12:12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //Date dd = sdf2.parse(str);






    }
}
