package cn.day17_Set_Son.cn.itcast_08;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Gypsophila on 2018/4/28.
 *
 * 键盘录入5个学生信息（姓名，语文成绩，数学成绩，英语成绩）按照总分从高到低输出到控制台
 * 分析：
 *      A：定义学生类
 *      B:创建一个TreeSet集合
 *      C:总分从高到低
 *      D:键盘录入五个学生信息
 *      E:遍历TreeSet集合
 *
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getTotal() - o2.getTotal();
                int num2 = num == 0?num:o1.getName().compareTo(o2.getName());
                return num2;
            }
        });



    }
}
