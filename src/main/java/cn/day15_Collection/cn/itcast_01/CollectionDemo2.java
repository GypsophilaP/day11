package cn.day15_Collection.cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Gypsophila on 2018/4/20.
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();

        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);

        System.out.println(c1.addAll(c2));
        System.out.println(c1.removeAll(c2));

        //retainAll 假设有两个集合A,B。A对B做交集，最终的结果保存在A中，B不变，最终的返回值表示A是否发生改变
        System.out.println(c1.retainAll(c2));


    }
}
