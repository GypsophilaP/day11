package cn.day17_Set_Son.cn.itcast_08;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by Gypsophila on 2018/4/28.
 *
 * 编写一个程序获取10个1至20的随机数 要求随机数不能重复
 * 分析：
 *      A:创建随机数对象
 *      B:创建一个Set集合
 *      C:判断集合长度是不是小于10
 *          是：创建一个随机数添加
 *          否：不管
 *      D:遍历Set集合
 *
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Random r = new Random();

        HashSet<Integer> hs = new HashSet<Integer>();

        while (hs.size()<10){
            hs.add(r.nextInt(20) +1);
        }

        for (Integer i :
                hs) {
            System.out.println(i);
        }
    }
}
