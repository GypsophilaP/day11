package cn.day13.cn.itclass_01.cn.it_class04;

/**
 * Created by Gypsophila on 2018/4/3.
 *
 * StringBuffer的替换功能：包左不包右
 * public StringBuffer replace(int start,int end,String str)：从start开始到end用str替换
 *
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append("world").append("java");

        sb.replace(5,20,"jieikuaile");
        System.out.println("sb:" + sb);

    }
}
