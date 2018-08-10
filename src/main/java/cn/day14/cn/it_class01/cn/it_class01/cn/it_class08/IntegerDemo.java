package cn.day14.cn.it_class01.cn.it_class01.cn.it_class08;

/**
 * Created by Gypsophila on 2018/4/9.
 *
 * JDK5新特性
 * 自动装箱：把基本类型转化为包装类类型
 * 自动拆低昂：吧包装类类型转换为基本类型
 *
 */
public class IntegerDemo {
    public static void main(String[] args) {

        //定义了一个int类型的包装类类型变量i

        Integer i = new Integer(100);
        Integer ii = 100;
        ii+=200;

        //在使用时，Interger x = null；上面的代码就会出现NullPointerException
        Integer iii = null;
        iii+=100;
        System.out.println(iii);

    }
}
