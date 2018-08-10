package cn.day19_Exception.cn.itcast_01.cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gypsophila on 2018/8/8.
 *
 *  有些时候 我们可以对异常进行处理 但又有些时候 我们根本就没有权利去处理某个异常 或者说处理不了就不处理了
 *
 *  为了解决出错问题 java针对这种情况 就提供了另一种处理方案:抛出
 *  格式:
 *      Throws 异常类名
 *      注意这个格式必须跟在方法的括号后面
 *  注意:尽量不要再main方法上抛出异常
 *
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("how a good day");
        //method();
        System.out.println("good");
    }
    private static void method()throws ParseException{
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date d = sdf.parse(s);

    }
}
