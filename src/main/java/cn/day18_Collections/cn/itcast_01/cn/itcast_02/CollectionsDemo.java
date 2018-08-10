package cn.day18_Collections.cn.itcast_01.cn.itcast_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Gypsophila on 2018/5/7.
 *
 * Collections可以针对ArrayList存储基本包装类的元素排序，存储自定义对象可不可以排序呢？
 *
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(27,"xiaoming"));
        list.add(new Student(28,"xiaoming"));
        list.add(new Student(26,"xiaoming"));
        list.add(new Student(29,"xiaoming"));
        list.add(new Student(20,"xiaoming"));

        Collections.sort(list);
        for (Student s :
                list) {
            System.out.println(s);
        }

    }



}
