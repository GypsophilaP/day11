package cn.day15_Collection.cn.itcast_01.cn.itcast_04;

import cn.itclass_02.*;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/23.
 *
 * 需求：存储自定义对象并遍历Student（name，age）
 * 分析：
 *      A:创建学生类
 *      B:创建集合对象
 *      C:创建学生对象
 *      D:吧学生对象添加到集合对象中
 *      E:遍历集合
 *
 */
public class CollectionTest2 {
    public static void main(String[] args) {
        ArrayList<Student> arrs = new ArrayList<Student>();
        arrs.add(new Student("xiaoming",19));
        arrs.add(new Student("xiaoming",19));
        arrs.add(new Student("xiaoming",19));
        arrs.add(new Student("xiaoming",19));
        arrs.add(new Student("xiaoming",19));
        Iterator<Student> it = arrs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
