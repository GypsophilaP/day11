package cn.day16_List_Sun.cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/23.
 * List的子类特点：
 *  ArrayList：底层数据结构是数组，查询快增删慢，线程不安全效率高
 *  Vector：底层数据结构是数组，查询快增删满，线程安全效率低
 *  LinkedList：底层数据结构是链表，查询慢增删快，线程不安全，效率高
 *
 *  案例：
 *      使用List的人和子类存储字符串或者存储自定义对象并遍历
 *
 *  ArrayList的使用
 *          存储字符串并遍历
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());




        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
