package cn.day16_JDK5News.cn.itcast_01.cn.itcast_03;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Gypsophila on 2018/4/25.
 *
 * public static <T> List<T> asList(T... a)：吧数组转化成集合
 *
 * 注意事项：
 *  UnsupportedOperationException
 *  虽然可以吧数组转成绩和但是几何长度不可变
 */
public class ArraysDemo {
    public static void main(String[] args) {
        String[] strs = {"hello","world","Java"};

        List<String> list = Arrays.asList(strs);

        for (String s :
                strs) {
            System.out.println(s);
        }

    }
}
