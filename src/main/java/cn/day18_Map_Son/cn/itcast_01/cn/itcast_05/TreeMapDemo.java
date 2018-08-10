package cn.day18_Map_Son.cn.itcast_01.cn.itcast_05;

import java.util.Map;
import java.util.TreeMap;


/**
 * Created by Gypsophila on 2018/5/3.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
        String str = new String("aababcabcdabcde");
        char[] chs =  str.toCharArray();

        for (char c :
                chs) {
            if (map.get(c) == null) {
                map.put(c,1);
            }else{
                map.put(c,map.get(c) + 1);
            }
        }

        for (Map.Entry<Character,Integer> entry:map.entrySet()
             ) {
            System.out.println("key:" + entry.getKey() + "-" + "value" + entry.getValue());
        }
    }
}
