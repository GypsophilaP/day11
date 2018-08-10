package cn.day14.cn.it_class01.cn.it_class01.cn.itclass_05;

/**
 * Created by Gypsophila on 2018/4/8.
 *
 * 需求1：把100这个数据的二进制，八进制，十六进制计算出来
 * 需求2：判断一个数据是否是int范围内的
 * 首先需要知道int的范围是多大？
 *
 *  为了对基本数据类型进行更多的操作，更方便的操作，Java就针对基本数据类型提供了对应的累类型。包装类类型
 *  byte    Byte
 *  short   Short
 *  int     Integer
 *  long    Long
 *  float   Float
 *  double  Double
 *  char    Character
 *  boolean Boolean
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //不麻烦的
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
