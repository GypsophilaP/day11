package cn.day14_DateFormat.itcast_01.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gypsophila on 2018/4/11.
 */
public class MyYearsOld {
    public static void main(String[] args) {
        Date d = new Date();

        String s = "1993-11-23";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date my = sdf.parse(s);
            my.getTime();
            Date d3 = new Date(d.getTime()-my.getTime());
            System.out.println(sdf.format(d3));
        } catch (ParseException e) {
            e.printStackTrace();
        }





    }
}
