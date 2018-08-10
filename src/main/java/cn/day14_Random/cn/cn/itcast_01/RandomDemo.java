package cn.day14_Random.cn.cn.itcast_01;

import java.util.Random;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * Random:产生随机数的类
 *  构造方法：
 *      public Random（）：没有种子，用的默认种子，是当前时间的毫秒值
 *      public Random（long seed）：给出指定种子
 *
 *   成员方法：
 *      public int nextInt（）：反悔的是int范围内的随机数
 *      public int nextInt（int n）：返回的是[0,n)范围内的随机数
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt());
        }

    }
}
