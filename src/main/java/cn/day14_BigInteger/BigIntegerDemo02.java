package cn.day14_BigInteger;

import java.math.BigInteger;

/**
 * Created by Gypsophila on 2018/4/11.
 */
public class BigIntegerDemo02 {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("50");

        System.out.println(bi1.add(bi2));
    }
}
