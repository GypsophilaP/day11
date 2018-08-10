package cn.day12.cn.itclass_01.cn.itclass_02;

/**
 * Created by Gypsophila on 2018/3/20.
 */

import java.util.Scanner;

/**
 *
 * 基本格式：
 *  public boolean hasNextXxx():判断是否是某种类型的元素
 *  public xxx nextXxx():获取该元素
 *
 * */

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("x:" + x);
    }
}
