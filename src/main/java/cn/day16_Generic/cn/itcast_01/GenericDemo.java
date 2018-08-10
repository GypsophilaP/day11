package cn.day16_Generic.cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/24.
 *
 * ArrayList存储字符串并遍历
 * 泛型必须是引用
 *
 * 泛型：是一种吧类型明确的工作推迟到创建对象或者调用方法的时候采取明确的特殊类型。参数化类型，把类型当做参数一样的传递
 * 格式：
 *      <数据类型>
 *  好处：
 *      A:把运行期间出现的问题提到了编译期间
 *      B:避免了强制类型转换
 *      C:优化了程序设计，解决了黄色警戒线
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();

        array.add("hello");
        array.add("world");
        array.add("java");

        array.add(10);

        Iterator it = array.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
