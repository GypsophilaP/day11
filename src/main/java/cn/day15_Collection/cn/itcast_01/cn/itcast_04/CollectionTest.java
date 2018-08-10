package cn.day15_Collection.cn.itcast_01.cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/23.
 *
 * 需求：存储字符串病变里
 * 分析：
 *      A;创建集合对象
 *      B:创建字符串对象
 *      C:吧字符串对象添加到集合中
 *      D:遍历集合
 *
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("1234");
        c.add("12345");
        c.add("123456");
        c.add("1234567");
        c.add("12345678");

        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
