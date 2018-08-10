package cn.day13.cn.itclass_01.cn.it_class05;

/**
 * Created by Gypsophila on 2018/4/3.
 *
 * StringBuffer的反转功能
 * public StringBuffer reverse();
 *
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append("world").reverse();
        System.out.println("sb:" + sb);
    }
}
