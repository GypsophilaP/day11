package cn.day16_List_test.cn.itCast_01;

import java.util.ArrayList;

/**
 * Created by Gypsophila on 2018/4/25.
 *
 * 集合的嵌套遍历
 *      需求：
 *          我们班有学生，每一个学生是不是一个对象，所以我们可以用一个集合表示我们班级的学生ArrayList《Student》
 *          但是呢 我们傍边还有班级，每个班级也是一个ArrayList
 *          也要用集合存储，怎么办呢？
 *          就是这样子的ArrayList<ArrayList<Student>>
 *
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> arrs = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < arrs.size(); i++) {
            for (int j = 0; j < arrs.get(i).size(); j++) {
                System.out.println(arrs.get(i).get(j));
            }
        }
    }
}
