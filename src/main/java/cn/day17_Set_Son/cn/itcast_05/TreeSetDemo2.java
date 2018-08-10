package cn.day17_Set_Son.cn.itcast_05;

import java.util.TreeSet;

/**
 * Created by Gypsophila on 2018/4/27.
 *
 * TreeSet存储自定义对象并保证排序和唯一
 *
 * A:你没有告诉我们怎么排序
 *      自然排序
 * B:元素什么情况算唯一
 *      成员变量都相同即为同一个元素
 *
 * TreeSet集合保证元素排序和唯一性的原理
 * 唯一性：是根据比较的返回是否为0来决定
 * 排序：  A:自然排序
 *  让元素所述的类实现自然排序接口Comparable
 *          B:比较器排序
 *          让集合的构造方法接受一个比较器接口的子类对象Comparator
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<Person>();

        ts.add(new Person("xiaoming",11));
        ts.add(new Person("xiaozhang",11));
        ts.add(new Person("xiaowing",11));
        ts.add(new Person("xiaoming",11));

        for (Person p :
                ts) {
            System.out.println(p);
        }

    }
}
