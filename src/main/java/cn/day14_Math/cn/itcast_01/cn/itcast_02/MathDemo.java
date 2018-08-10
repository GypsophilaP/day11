package cn.day14_Math.cn.itcast_01.cn.itcast_02;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * 需求：请设计一个方法，可以实现获取任意范围内的随机数
 *      分析：
 *          A:键盘录入两个数
 *              int start
 *              int end
 *          B:想办法在start到end之间的最技术
 *          C:输出这两个随机数
 *
 */
public class MathDemo {
    public static void main(String[] args) {

    }
    public static int getRandom(int start,int end){
        return (int)(Math.random()*(end-start+1)) + start;
    }
}
