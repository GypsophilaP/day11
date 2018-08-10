package cn.day18_Collections.cn.itcast_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Gypsophila on 2018/5/7.
 *
 * Collections:是针对集合进行操作的工具类，都是静态方法
 *
 * 面试题：
 * Collection和Collections的区别？
 * Collection：是单列集合的底层接口
 * Collections：是针对集合操作的工具类 有对集合进行排序和二分查找的方法
 *
 * 要知道的方法
 *      sort 排序 默认情况下是自然排序
 *      binarySearch 二分查找
 *      max 最大值
 *      reverse 反转
 *      shuffle 随机置换
 *
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        System.out.println("list " + list);

        Collections.sort(list);

        System.out.println("list " + list);
        System.out.println("binarySearch" + Collections.binarySearch(list,30));
        System.out.println(Collections.max(list));

        Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
