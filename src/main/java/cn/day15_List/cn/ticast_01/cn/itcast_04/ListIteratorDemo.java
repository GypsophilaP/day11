package cn.day15_List.cn.ticast_01.cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Gypsophila on 2018/4/23.
 *
 * 列表迭代器ListIterator
 * 该迭代器继承了Iterator迭代器，所以可以直接使用hasNext和next
 *
 * 特有功能：
 *      E previous返回上一个元素
 *      注意：ListIterator可以实现你想遍历，但是必须先争相遍历，才能你想遍历，所以一般无意义，不使用
 *
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        ListIterator lit = list.listIterator();

        while (lit.hasNext()){
            System.out.println(lit.next());
        }

        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

    }
}
