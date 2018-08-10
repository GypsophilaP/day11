package cn.day14_BigBecimal.cn.itcast_01;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Gypsophila on 2018/4/11.
 */
public class BigBecimalDemo {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        System.out.println("add:" + bd1.add(bd2));

    }
}
