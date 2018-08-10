package cn.day18_Map_Son.cn.itcast_01.cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by Gypsophila on 2018/5/2.
 *
 * LinkedHashMap:Map接口的哈希表和链表实现，具有可预知的迭代顺序
 * 由哈希表保证键的唯一性
 * 有链表保证键的顺序性
 *
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>();

        hm.put("123","hello");
        hm.put("234","world");
        hm.put("345","java");

        Set<String> set = hm.keySet();

        for (String key :
                set) {
            System.out.println("key " + key + "value " + hm.get(key));
        }
     }
}
