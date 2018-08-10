package cn.day16_List_test.cn.itCast_01.itcast_02;

import cn.day16_Generic.cn.itcast_01.cn.cn.itcast_06.Inter;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Gypsophila on 2018/4/25.
 * 获取10个1-20之间的随机数，要求不能重复
 * 用集合实现：
 * 分析：
 *      A:创建产生随机数的对象
 *      B:创建一个存储随机数的集合
 *      C:定义一个统计变量。从0开始
 *      D:判断统计遍历是否小于10
 *              是：先产生一个随机数，判断随机数在集合中是否存在，如果不存在，就添加，统计变量++ 不存在就不搭理他
 *              否：就退出循环
 *      E:遍历集合
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> arrs = new ArrayList<Integer>();

        int count = 0;
        while (count <10){
            int number = r.nextInt(20) +1;
            if(!arrs.contains(number)){
                arrs.add(number);
                count++;
            }
        }

        for (Integer i :
              arrs  ) {
            System.out.println(i);
        }
    }
}
