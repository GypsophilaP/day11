package cn.day13.cn.itclass_01.cn.it_class03;

/**
 * Created by Gypsophila on 2018/4/3.
 *
 * StringBufferde的删除功能
 * public StringBuffer deleteCharAt（int index）：删除指定位置的字符，并返回本身
 * public StringBuffer delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
 *
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello").append("world").append("java");

        sb.deleteCharAt(1).deleteCharAt(1);

        sb.delete(3,8);
        System.out.println("sb:" + sb);

    }
}
