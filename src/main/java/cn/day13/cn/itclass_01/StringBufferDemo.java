package cn.day13.cn.itclass_01;

/**
 * Created by Gypsophila on 2018/4/3.
 */

/**
 *
 * 线程安全（多线程讲解）
 * 安全--同步--数据是安全的
 * 不安全--不同步--效率高一些
 * 安全和效率问题是永远困扰我们的问题
 * 安全：医院的网站，银行网站
 * 效率：新闻网站，论坛
 *
 * StringBuffer：
 *  线程安全的可变字符串
 * StringBuffer和String的区别？
 * 前者长度和内容可变，后者不可变
 * 如果使用前者做字符串的拼接，不会浪费太多资源
 *
 * StringBuffer的构造方法
 *
 构造方法摘要
 StringBuffer()
 构造一个其中不带字符的字符串缓冲区，初始容量为 16 个字符。
 StringBuffer(CharSequence seq)
 public java.lang.StringBuilder(CharSequence seq) 构造一个字符串缓冲区，它包含与指定的 CharSequence 相同的字符。
 StringBuffer(int capacity)
 构造一个不带字符，但具有指定初始容量的字符串缓冲区。
 StringBuffer(String str)
 构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
 *
 * StringBuffer方法
 * capacity 容量
 * */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("sb:" + sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
