package cn.day12.cn.itclass_01.itclass_04;

/**
 * Created by Gypsophila on 2018/3/27.
 */

/**
 *
 * String s = new String("hello") Srting s = "hello"的区别
 * 前者创建两个对象 后者创建一个对象
 *
 * 字符串如果是常量相加，是先相加，然后再常量池里找 如果有就返回 否则就创建
 * 字符串如果是变量相加，先开空间，在拼接
 *
 * ==比较引用类型的地址值是都相同
 * equals：默认比地址 String类比的是内容是否相同
 *
 *
 * 字符串内容为空和字符串对象为空是两个东西
 * String s = “”；
 * String s = null；
 *
 * new在堆内存
 *
 *
 * */

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
    }
}
