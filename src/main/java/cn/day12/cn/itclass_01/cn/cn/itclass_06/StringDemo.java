package cn.day12.cn.itclass_01.cn.cn.itclass_06;

/**
 * Created by Gypsophila on 2018/4/2.
 */

/**
 *
 * String类的其他功能：
 *      替换功能
 *      去除字符串量空格
 *      按照字典顺序比较两个字符串
 * */

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "helloworld";
        String str2 = str1.replace('l','k');
        System.out.println(str2);

        String s4 = " hello world ";
        String s5 = s4.trim();
        System.out.println(s5);



    }
}
