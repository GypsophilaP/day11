package cn.day13.cn.itclass_01.cn.it_class06;

/**
 * Created by Gypsophila on 2018/4/3.
 *
 * StringBuffer的截取功能:返回值类型是String
 * public String substring(int start)
 * public String substring(int start,int end)
 *
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append("world").append("java");
        String s = sb.substring(5);
        System.out.println(s);
        System.out.println(sb);
    }
}
