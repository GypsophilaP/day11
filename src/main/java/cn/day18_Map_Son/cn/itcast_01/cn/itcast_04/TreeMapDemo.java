package cn.day18_Map_Son.cn.itcast_01.cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Gypsophila on 2018/5/2.
 * TreeMap：是基于红黑树的Map接口的实现
 *
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> tm = new TreeMap<String,String>();
        tm.put("hello","1");
        tm.put("world","2");
        tm.put("java","3");

        Set<String> set = tm.keySet();

        for (String key :
                set) {
            System.out.println("key " + key + "value " + tm.get(key));
        }
    }
}
