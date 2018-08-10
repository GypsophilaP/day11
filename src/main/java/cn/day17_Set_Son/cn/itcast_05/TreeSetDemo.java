package cn.day17_Set_Son.cn.itcast_05;

import java.util.TreeSet;

/**
 * Created by Gypsophila on 2018/4/27.
 *
 * TreeSet：能够对元素按照某种规则进行排序
 * 排序有两种方式
 * A:自然排序
 * B:比较器排序
 *
 * TreeSet集合的特点：排序和唯一
 *
 * 通过观察Tree的add（）方法，我们知道最终要看TreeMap的put方法
 *
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(20);
        ts.add(21);
        ts.add(31);
        ts.add(14);

        for (Integer i :
                ts) {
            System.out.println(i);
        }
    }
}
