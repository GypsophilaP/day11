package cn.day14_System.itcast_01;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * System类包含一些有用的字段和方法。他不能呗实例化
 *      方法：
 *          public static void gc()
 *          public static void exit(int status)
 *          public static long currentTimeMills()
 *          public static void arraycopy()
 *
 */
public class SystemDemo {
    public static void main(String[] args) {
        Person p = new Person("asd",60);
        System.out.println(p);
        p = null;
        System.gc();

    }
}
