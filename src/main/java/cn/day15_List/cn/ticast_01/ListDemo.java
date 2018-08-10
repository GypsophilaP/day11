package cn.day15_List.cn.ticast_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gypsophila on 2018/4/23.
 *
 * 需求：List集合存储字符串并遍历
 *
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("12345");
        list.add("22345");
        list.add("32345");
        list.add("42345");
        list.add("52345");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
