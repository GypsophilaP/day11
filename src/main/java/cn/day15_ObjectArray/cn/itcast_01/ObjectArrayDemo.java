package cn.day15_ObjectArray.cn.itcast_01;

import cn.itclass_02.*;

/**
 * Created by Gypsophila on 2018/4/12.
 *
 * 我有5个学生，请把这五个学生的信息存储到数组中，获取每个学生的信息
 *      学生：Student
 *      成员变量：name，age
 *      构造方法：无参，带参
 *      成员方法：get
 *      存储学生的数组
 *  分析：
 *      A:创建学生类
 *      B:创建学生数组
 *      C:创建五个学生对象 并赋值
 *      D:吧c步骤中的元素放到数组中
 *      E:便利学生数组
 *
 */
public class ObjectArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student s1 = new Student("Tom",21);
        Student s2 = new Student("Tim",22);
        Student s3 = new Student("T",23);
        Student s4 = new Student("Tam",24);
        Student s5 = new Student("Tomas",25);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

    }
}
