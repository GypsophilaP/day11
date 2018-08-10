package cn.day15_Collection.cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Gypsophila on 2018/4/16.
 *
 * 集合的由来：
 *      面向对象需要容器类型的
 *      数组和StringBuffer是容器类型的 需要使用对象数组
 *      对象数组不能适应变化的需求 数组长度是固定的 Java为了应对变化的需求，Java就提供了集合类供我们使用
 *
 *      数组和集合的区别
 *      A:长度区别
 *          数组长度固定
 *          几何长度可变
 *      B:内容不同
 *          数组存储的是同一种类型的元素
 *          而集合可以存储不同类型的元素
 *      C:元素的数据类型问题
 *          数组可以存储基本数据类型，也可以存储引用数据类型
 *          集合只能存储引用类型
 *
 *      刚说过集合是存储多个元素的，但是，存储多个元素我们也是有不同需求的：比如说，我要这多个元素不能有相同的元素，再比如果 我要这多个元素按照某种规则排序一下。针对不同的需求，Java就提供了不同的集合类，这样 java就提供了很多个集合类
 *      着多个集合类的数据结构不同 结构不同不重要，重要的是能存储东西，并且还要能够使用这些东西 比如判断获取等
 *      既然这样，那么着多个集合类是有共性的内容的
 *
 *      数据结构：数据的存储方式
 *
 *      Collection：试剂盒的顶层接口，他的子体系有重复的，有位移的，有有序的，有无序的
 *
 *      Collection的功能概述：
 *      增删改查
 *      长度功能
 *
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //测试不带All的方法
        //创建独享
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");
        c.remove("hello");
        //c.clear();
        System.out.println("contains:"+c.contains("hello"));
        System.out.println("isEmpty:"+c.isEmpty());

        System.out.println(c.size());



        System.out.println("c:"+c);


    }
}
