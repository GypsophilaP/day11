package cn.day17_Set_Son.cn.itcast_04;

import java.util.LinkedHashSet;

/**
 * Created by Gypsophila on 2018/4/27.
 *
 * LinkedHashSet：底层数据结构有哈希表和链表组成
 * 哈希表保证元素的唯一性
 * 链表保证元素有序（存储和取出是一致）
 *
 *
 *
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");

        for (String s :
                lhs) {
            System.out.println(s);
        }
    }
}
