package cn.day14_BigInteger;

import java.math.BigInteger;

/**
 * Created by Gypsophila on 2018/4/11.
 *
 *  BigInteger:可以让超过Integer范围内的数据进行运算
 *  构造方法：
 *  BigInteger（String val）
 *
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        System.out.println(Integer.MAX_VALUE);
        Integer i2 = new Integer("2147483647");


        BigInteger bi = new BigInteger("2147483648");
        System.out.println("bi:" +bi);


    }
}
