package cn.day15_Collection.cn.itcast_01.cn.ticast_03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/23.
 *
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历
 *      A:自己的类名不要和我们学习的要是用的API中的类名相同
 *      B:赋值代码的时候，很容易吧那个类所在的包也导入过来，容易出现不能理解的问题
 *
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Student> arrs = new ArrayList<Student>();
        arrs.add(new Student("xiaoming",19));
        arrs.add(new Student("xiaowang",19));
        arrs.add(new Student("xiaozhang",19));
        arrs.add(new Student("xiaozhi",19));
        arrs.add(new Student("xiaoren",19));
        Iterator<Student> it = arrs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
