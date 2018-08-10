package cn.day12.cn.itclass_01.itclass_04;

/**
 * Created by Gypsophila on 2018/3/22.
 */

/**
 *
 * 字符串：就是由多个字符组成的一串数据。也可以看成是一个字符数组
 *  字符串字面值“abs”也可以看成是一个字符串对象
 *  自费赴传世常量 一旦被赋值 就不能改变 值不能变 而不是引用
 *
 *  构造方法：
 *      public String():空构造
 *      public String(byte[] bytes,int offset,int length)：把字节数组的一部分转化为字符串
 *
 *      字符串方法：
 *          public int length（）：长度
 *
 *
 * */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("S1" + s1);
        System.out.println(s1.length());

        byte[] bytes = {1,2,3,4,5,6,7};
        String s2 = new String(bytes);
        System.out.println("s2" + s2);
        System.out.println("s2.length" + s2.length());

        String s3 = new String(bytes,1,2);
        

    }
}
