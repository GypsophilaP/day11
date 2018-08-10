package cn.day12.cn.itclass_01;

/**
 * Created by Gypsophila on 2018/3/20.
 */

/**
 * java.util.Scanner
 * Scanner:用于接收键盘录入数据
 *
 * 前面的时候：
 *  A：导包
 *  B:创建对象
 *  C:调用方法
 *
 *  System类下有一个静态字段：
 *      public static final InputStream in;
 *
 *
 *
 * */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("x" + x);
    }
}
