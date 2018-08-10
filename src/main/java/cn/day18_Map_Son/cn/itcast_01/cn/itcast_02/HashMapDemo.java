package cn.day18_Map_Son.cn.itcast_01.cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Gypsophila on 2018/5/2.
 *
 * HashMap是基于哈希表的Map接口实现
 * 哈希表的作用是用来保证键的唯一性的
 *
 *
 *
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();

        hm.put("mayun","alibaba");
        hm.put("mahuateng","tengxun");
        hm.put("liuqiangdong","jingdong");
        hm.put("leijun","xiaomi");
        Set<String> set = hm.keySet();
        for (String str :
                set) {
            System.out.println("key " + str + "value " + hm.get(str));
        }

    }
}
