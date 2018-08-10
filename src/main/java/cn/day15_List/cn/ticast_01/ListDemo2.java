package cn.day15_List.cn.ticast_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gypsophila on 2018/4/23.
 *
 * List集合的特点：
 *      有序（存储和取出的元素一直），可重复的
 *
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator it  = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }





}
