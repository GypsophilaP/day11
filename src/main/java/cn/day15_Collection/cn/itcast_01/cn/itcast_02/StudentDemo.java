package cn.day15_Collection.cn.itcast_01.cn.itcast_02;

import cn.itclass_02.*;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/20.
 *
 * 练习：用集合存储五个学生对象，并把学生对象进行遍历
 *
 *
 */
public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student("ming",15));
        arrayList.add(new Student("mingming",16));
        arrayList.add(new Student("zhang",17));
        arrayList.add(new Student("wang",18));
        arrayList.add(new Student("li",19));

        Iterator<Student> it = arrayList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
