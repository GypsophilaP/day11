package cn.day17_Set_Son.cn.itcast_03;

import java.util.HashSet;

/**
 * Created by Gypsophila on 2018/4/27.
 *
 * HashSet集合存储自定义对象并遍历。如果对象的成员变量值相同，即为同一个对象
 *
 */
public class PersonDemo {
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<Person>();

        hs.add(new Person("dahuang",10));
        hs.add(new Person("erhuang",10));
        hs.add(new Person("sanhuang",10));
        hs.add(new Person("dahuang",10));

        for (Person p :
                hs) {
            System.out.println(p);
        }
    }
}
