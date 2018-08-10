package cn.itclass_04;

/**
 * Created by Gypsophila on 2018/3/19.
 */

import cn.itclass_02.*;

/**
 *
 * protect void finalize():当垃圾回收器确定不存在对该对象的更多引用时，有对象的垃圾回收期调用此方法，用于垃圾回收，但是什么时候调用由系统决定
 * protect Object clone()创建并返回此对象的一个副本
 *  A:重写该方法
 *
 *  Cloneable :标记接口
 *      此类实现了Cloneable接口 以指示Object.clone（）方法可以合法的对该类实例进行按字段复制
 *      这个借口是标记接口，告诉我们实现了标记接口的对象就可以实现类的复制了
 * */
public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student();

        Object obj = s.clone();
    }
}
