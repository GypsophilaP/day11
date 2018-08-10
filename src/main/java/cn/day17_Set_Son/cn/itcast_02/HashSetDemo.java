package cn.day17_Set_Son.cn.itcast_02;

import java.util.HashSet;

/**
 * Created by Gypsophila on 2018/4/27.
 *
 * HashSet:存储字符串并遍历
 *      问题：为什么存储字符串只存储了一个呢
 *      通过查看add方法的源码，我们知道这个方法底层依赖两个方法：hashCode和equals
 *      步骤：
 *          首先比较哈希值
 *          如果相同，继续走，比较地址值或者走equals
 *          如果不同，就直接添加到集合中
 *      按照方法的步骤来说：
 *          A:先看hashcode值是否相同
 *              相同：继续走equals方法
 *                  返回true：说明元素重复，就不添加
 *                  返回false：说明元素不重复，就添加到集合
 *              不同：就直接吧元素添加到集合
 *      如果类本身没有重写这两个方法，默认使用Object
 *      一般来说不会相同
 *      而String类重写了hashCode和equals方法，所以他就可以吧内容相同的字符串去掉，只留下一个
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("hello");
        hs.add("world");
        hs.add("java");

        for (String s :
                hs) {
            System.out.println(s);
        }

    }
}
