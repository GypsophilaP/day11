package cn.day15_List.cn.ticast_01.cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gypsophila on 2018/4/23.
 *
 * List集合的特有功能：
 *      A:添加功能 add在指定位置添加元素
 *
 *      B:获取功能 get 获取指定位置的元素
 *
 *      C:列表迭代器
 *          ListIterator listIterator（） 列表迭代器
 *      D:删除功能
 *          remove 删除指定位置元素
 *      E:修改功能
 *          set 根据索引修改元素，返回被修改的元素
 *
 *
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        list.add(1,"andriod");

        list.add(3,"javaee");

        System.out.println("get:" + list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
