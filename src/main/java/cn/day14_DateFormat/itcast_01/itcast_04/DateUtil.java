package cn.day14_DateFormat.itcast_01.itcast_04;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gypsophila on 2018/4/11.
 *
 * 这是日期和字符串互相转换的工具类
 *
 */
public class DateUtil {
    private DateUtil(){}

    /**
     * */
    public static String dateToString(Date d, String format){
        return new SimpleDateFormat(format).format(d);

    }

    public static Date stringToDate(String s,String format){
        return new Date();
        //return new SimpleDateFormat(format).parse(s);
    }

}
