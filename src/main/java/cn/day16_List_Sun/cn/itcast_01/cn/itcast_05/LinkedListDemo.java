package cn.day16_List_Sun.cn.itcast_01.cn.itcast_05;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Gypsophila on 2018/4/24.
 *
 * 请用LinkedList模拟栈数据结构的集合，并测试
 *
 * 题目的意思是：
 *      你自己定义一个集合类，在这个集合类内部可以使用LinkedList模拟
 *
 *
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //A:LinkedList的特有添加功能addFirst()
        //B:栈的特点先进先出

        //创建集合对象
        LinkedList link = new LinkedList();

        link.addFirst("hello");
        link.addFirst("world");
        link.addFirst("java");

        Iterator it = link.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
