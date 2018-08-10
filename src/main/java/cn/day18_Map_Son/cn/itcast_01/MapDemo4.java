package cn.day18_Map_Son.cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Gypsophila on 2018/5/2.
 *
 * Map集合遍历
 * Map -- 夫妻对
 *
 * 思路：
 *      A:获取所有键值对对象的集合
 *
 *      B:遍历所有键值对对象的集合 获取每一个键值对对象
 *      C:根据简直对对象获取键和值
 *
 */
public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("yangguo","xiaolongnv");
        map.put("guojing","huangrong");
        map.put("yangkang","munianci");
        map.put("chenxuanfeng","meichaofeng");


        for (Map.Entry<String, String> m :
                map.entrySet()) {
            System.out.println("key " + m.getKey() + " value " + m.getValue());
        }

    }
}
