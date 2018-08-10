package cn.day18_Map_Son.cn.itcast_01;

import java.util.HashMap;

/**
 * Created by Gypsophila on 2018/5/2.
 *
 * 作为学生来说，是根据编号来区分不同的学生的 那么假设我现在已经知道了学生的学号 我要根据学号去获取学生的姓名
 * 请问怎么做呢
 * 如果采用前面讲解过的集合 我们只能吧学号和学生姓名作为一个对象的成员 然后存储整个对象，将来便利的时候 判断获取对应的名称
 * 但是如果我都能把学生姓名拿出来了 我还需要根据编号去找吗
 *
 *  针对我们目前的这种需求：仅仅知道学号就想知道学生姓名的情况 就想去知道学生姓名的情况，java就提供了一种新的集合Map
 *  通过查看API 我么知道Map集合的一个最大的特点 就是他可以存储键值对元素 这时候存储我们上面的需求 就可以这样做
 *      学号1 姓名1
 *      学号2 姓名2
 *      学号3 姓名3
 *
 *  Map集合的特点：
 *      将键映射到值的对象 一个映射不能包括重复的键 每个键最多只能映射到一个值
 *
 *  Map集合和Collection集合的区别？
 *      Map集合存储元素是成对出现的，Map集合的键是唯一的 值是可以重复的
 *      Collection集合存储元素是单独出现的，Collection集合存储元素是单独出现的 Collection的儿子Set是唯一的 List是可重复的
 *
 *      注意：
 *          Map集合的数据值指针对键有效
 *          Collection集合的数据结构是针对元素有效
 *
 *          HashMap。TreeMap
 *
 * Map集合的功能概述：
 * 1 增加功能 put
 * 2 删除功能 clear remove
 * 3 判断功能 containsKey containsValue isEmpty
 * 4 获取功能 entrySet get keySet values
 * 5 长度功能 size
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();

        System.out.println(hm.put("wenzhang","mayili"));
        System.out.println(hm.put("wenzhang","yaodi"));
        hm.put("yangmi","liukaiwei");
        hm.put("dengchao","sunli");
        hm.remove("yangmi");
        hm.remove("dengchao");
        System.out.println(hm.isEmpty());


        System.out.println("map" + hm);
    }
}
