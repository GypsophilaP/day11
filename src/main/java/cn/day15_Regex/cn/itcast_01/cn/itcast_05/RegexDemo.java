package cn.day15_Regex.cn.itcast_01.cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * 获取功能
 *      Pattern类和Matcher类的使用
 *
 */
public class RegexDemo {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches();
        System.out.println(b);

        String s = "aaaaab";
        String regex = "a*b";
        System.out.println(s.matches(regex));

    }
}
