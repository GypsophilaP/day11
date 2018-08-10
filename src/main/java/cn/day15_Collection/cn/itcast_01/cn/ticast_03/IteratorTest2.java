package cn.day15_Collection.cn.itcast_01.cn.ticast_03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/23.
 *
 * 迭代器为什么不定义成一个类而是一个接口
 *      假设迭代器定义的是一个类，这样我们就可以创建该类的对象，调用该类的方法来实现集合的遍历。但是呢 java中提供了很多的集合类，
 *      而这些集合类的数据结构是不同的，所以，存储的方式和遍历的方式是不同的，进而他们的便利方式也应该不是一样的，最终，他们就没有定义迭代器类
 *      而无论那种集合，都应该具备获取元素的操作，并且最好在辅助于判断功能，这样在获取前先判断在获取，这样就更不容易出粗，也就是说判断功能和获取功能应该是一个集合遍历所具备的，而美中集合的方式有不太一样，所以我们吧这两个功能给提取出来，并不提供具体的实现，这种方式
 *      就是结构
 *      那么真正的具体实现类在哪里呢？
 *      在真正的具体的子类中，以内部类的方式体现的。
 *
 *
 */
public class IteratorTest2 {
    public static void main(String[] args) {
        ArrayList<Student> arrs = new ArrayList<Student>();
        arrs.add(new Student("xiaoming",19));
        arrs.add(new Student("xiaowang",19));
        arrs.add(new Student("xiaozhang",19));
        arrs.add(new Student("xiaozhi",19));
        arrs.add(new Student("xiaoren",19));
        Iterator<Student> it = arrs.iterator();
        /*while(it.hasNext()){
            System.out.println(it.next());
        }*/

    }
}
