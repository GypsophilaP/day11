package cn.day17_Set_Son.cn.itcast_02;

import java.util.HashSet;

/**
 * Created by Gypsophila on 2018/4/27.
 *
 * 需求：存储自定义对象，并保证元素的唯一性
 * 要求：如果两个对象的成员变量值都相同，则为同一个元素
 *
 * 目前是不符合我的要求的：因为我们知道HashSet底层以来的是hashCode和equals方法
 * 而这两个方法在我们的学生类中没有重写，所以默认使用Object类
 * 这个时候他们的哈希值是不会一样的 根本不会继续判断 执行了添加操作
 *
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        hs.add(new Student("xiaoming",19));
        hs.add(new Student("xiaoming",19));
        hs.add(new Student("xiaozhang",19));
        hs.add(new Student("xiaogou",19));
        hs.add(new Student("xiaozhu",19));

        for (Student s :
                hs) {
            System.out.println(s);
        }

    }
}
