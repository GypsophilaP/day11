package cn.day15_Collection.cn.itcast_01.cn.ticast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/20.
 *
 * Iterator iterator():迭代器，集合的专用遍历方式
 *      获取元素：Object next():获取元素
 *      NoSuchElementException:没有这样的元素。因为你已经找到最后了
 *
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator it = c.iterator();
        Object obj = it.next();
        System.out.println(it.next());

        //最后一个不应该写，所以我们应该在每次获取前，有一个判断就好了
        if(it.hasNext()){

        }
    }
}
