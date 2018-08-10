package cn.day18_Map_Son.cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Gypsophila on 2018/5/2.
 *获取功能
 * get
 * keySet
 * values
 *
 */
public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("dengchao","sunli");
        map.put("huangxiaoming","yangying");
        map.put("zhoujielun","caiyilin");
        map.put("liukaiwei","yangmi");

        System.out.println(map.get("zhoujielun"));

        Set<String> set = map.keySet();
        for (String str :
                set) {
            System.out.println(str);
        }

        Collection<String> con = map.values();

        for (String str :
                con) {
            System.out.println(str);
        }

    }
}
