/*
package cn.itclass_02;

*/
/**
 * Created by Gypsophila on 2018/3/19.
 *//*


*/
/**
 *
 * public String toString():返回该对象的字符串表示
 *建议所有子类都重写该方法
 * 怎么重写
 * 吧所有成员变量返回
 *
 * public boolean equals(Object obj):知识其他某个对象是否与此对象相等
 * 这个方法默认情况下值得是地址值 比较低纸质一般来说意义不大
 * 怎么重写呢
 *  一般都是用来比较对象的成员变量值是否相同
 *==:
 * 基本类型：比较的是值是否相同
 * 引用类型：比较的是地址值是否相同
 *
 * *//*


public class StudentDemo {
    public static void main(String[] args){
        //Student s = new Student();
        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());

        System.out.println(s.toString());
        System.out.println(s.getClass().getName() + '@' + Integer.toHexString(s.hashCode()));

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));


    }
}
*/
