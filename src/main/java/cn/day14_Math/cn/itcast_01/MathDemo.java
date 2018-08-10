package cn.day14_Math.cn.itcast_01;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * Math:用于数学运算的类
 *  abs绝对值
 *  ceil向上取整
 *  floor向下取整
 *  max min 最大值最小值
 *  pow迷
 *  random 随机数（0.0-1.0）
 *  random四舍五入
 *  sqrt 正平方根
 *
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        System.out.println(Math.E);

        System.out.println("abs" + Math.abs(10));

        System.out.println("ceil" + Math.ceil(12.34));
        System.out.println("ceil" + Math.ceil(1.6));

        System.out.println("ceil" + Math.floor(12.34));
        System.out.println("ceil" + Math.floor(12.56));



    }
}
