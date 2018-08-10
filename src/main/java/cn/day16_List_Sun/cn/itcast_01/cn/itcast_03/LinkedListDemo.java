package cn.day16_List_Sun.cn.itcast_01.cn.itcast_03;

import java.util.LinkedList;

/**
 * Created by Gypsophila on 2018/4/24.
 *
 * LinkedList的特有功能：
 *      A:添加功能：addFirst addLast
 *      B:获取功能：getFirst getLast
 *
 *      C:删除功能：removeFirst removeLast
 *
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("hello");
        link.add("world");
        link.add("java");

        link.addFirst("javaee");

        System.out.println(link.getFirst());
    }
}
