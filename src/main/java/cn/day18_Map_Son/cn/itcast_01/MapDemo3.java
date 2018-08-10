package cn.day18_Map_Son.cn.itcast_01;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Gypsophila on 2018/5/2.
 *
 * map集合的遍历
 * Map 夫妻对
 *
 * A:吧所有的丈夫集中起来
 * B:遍历丈夫的集合获取得到每一个丈夫
 * C:让丈夫去找自己的妻子
 *
 *  转换：
 *      A:获取所有的键
 *      B:遍历键的集合，获取得到每一个键
 *      C:根据键去获取值
 *
 */
public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("yangguo","xiaolongnv");
        map.put("guojing","huangrong");
        map.put("yangkang","munianci");
        map.put("chenxuanfeng","meichaofeng");

        Set<String> set = map.keySet();
        for (String str :
                set) {

            System.out.println("key " + str + "," +"value " + map.get(str));
        }
    }

}
