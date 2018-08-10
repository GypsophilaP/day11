package cn.day15_Regex.cn.itcast_01.cn.itcast_04;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * 替换功能
 *      String类的public String replaceAll(String regex,String replacement)
 *      使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串
 *
 */
public class RegexDemo {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "hello12345worldjava";
        //用*代替数字
        String regex = "\\d";
        String ss = "*";

        String res = s.replaceAll(regex,ss);
        System.out.println(res);

    }
}
