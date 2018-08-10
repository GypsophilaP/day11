package cn.day16_List_Sun.cn.itcast_01;

import java.util.Vector;

/**
 * Created by Gypsophila on 2018/4/23.
 *
 * Vector的特有功能：
 * 1：添加功能
 *      addElement
 * 2：获取功能
 *      elementAt
 *      Enumeration elements
 *
 * JDK升级的原因：
 *      A:安全
 *      B:效率
 *      C:简化书写
 *
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");

        for (int i = 0; i < v.size(); i++) {
            v.elementAt(i);
        }
    }
}
