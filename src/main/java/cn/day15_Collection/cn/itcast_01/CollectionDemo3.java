package cn.day15_Collection.cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Gypsophila on 2018/4/20.
 *
 * 集合的便利。其实就是一次获取集合中的每一个元素
 * Object[] toArray()：吧集合转成数组，可以实现集合的遍历
 *
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");
        Object[] objs = c.toArray();
        for (Object obj :
                objs) {
            String str = (String)obj;
            System.out.println(str);
        }
    }
}
