package cn.day16_List_Sun.cn.itcast_01.cn.itcast_04;

import cn.itclass_02.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/24.
 * 需求：去除集合中自定义对象的重复值（对象的成员变量值都相同）
 *
 * contains（）方法的底层以来的是equals方法
 *
 *
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        //创建集合对象

        ArrayList<Student> array = new ArrayList<Student>();
        array.add(new Student("xiaoming",11));
        array.add(new Student("xiaoming",11));
        array.add(new Student("xiaoying",11));
        array.add(new Student("xiaoling",11));
        array.add(new Student("xiaoping",11));

        ArrayList newArray = new ArrayList();

        Iterator it = array.iterator();
        while(it.hasNext()){
            Student s = (Student) it.next();
            if(!newArray.contains(s)){
                newArray.add(s);
            }
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }



    }
}
