package cn.day18_Map_Son.cn.itcast_01.cn.itcast_07;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Gypsophila on 2018/5/7.
 *
 * Hashtable和HashMap的区别
 * Hashtable：线程安全 效率低 不允许null键值
 * HashMap：县城不安全 效率高 允许null键和null值
 * List,Set,Map等接口是否都继承子Map接口
 * List Set继承自Collection接口
 * Map本身就是底层接口
 *
 */
public class HashtableDemo {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put(null,null);
        Hashtable<String,String> table = new Hashtable<String,String>();
        //table.put(null,null);
    }
}
