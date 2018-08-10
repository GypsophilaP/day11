package cn.day15_Regex.cn.itcast_01.cn.itcast_03;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * 分割功能
 *      String类的public String[] split(String regex)
 *      根据给定正则表达式的匹配拆分此字符串
 *
 *      举例：
 *
 */
public class RegexDemo {
    public static void main(String[] args) {
        String ages = "18-24";

        String regex = "-";

        String[] strArray = ages.split(regex);


        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        int startAge = Integer.parseInt(strArray[0]);
        int endAge = Integer.parseInt(strArray[1]);

    }
}
