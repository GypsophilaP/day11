package cn.day15_Regex.cn.itcast_01.cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * 获取功能：获取下面字符串中由三个字符组成的单词
 *
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        String str = "da jia ting wo shuo,jin tian yao xia yu";
        Pattern p = Pattern.compile("\\b[a-zA-Z]{3}\\b");
        Matcher m = p.matcher(str);
        while(m.find()){
            String ss = m.group();
            System.out.println(ss);
        }
        boolean flag = m.find();



    }
}
