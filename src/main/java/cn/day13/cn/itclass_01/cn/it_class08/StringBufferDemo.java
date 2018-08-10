package cn.day13.cn.itclass_01.cn.it_class08;

/**
 * Created by Gypsophila on 2018/4/3.
 *
 * 面试题：
 * String，StringBuffer，StringBuilder的区别
 * A：String是内容不可变得，剩下两个是可变的
 * B：StringBuffer是同步的，数据安全的，效率低；StringBuilder是不同步的，效率高
 *
 * 2：StringBuffer和数组的区别
 *  二者都可以看成是一个容器，装其他的数据
 *  但是StringBuffer的数据最红是一个字符串数据
 *  而数组可以放置的是任意类型的同一种数据
 *
 *  3：形式参数问题
 *  String作为参数传递
 *  StringBuffer作为参数传递
 *
 *  形式参数：
 *      基本类型：
 *     形式参数的改变不影响实际参数
 *     引用类型：心事参数的改变直接影响实际参数
 *     注意：String作为参数传递效果与基本类型一致
 *
 *
 */
public class StringBufferDemo {
}
