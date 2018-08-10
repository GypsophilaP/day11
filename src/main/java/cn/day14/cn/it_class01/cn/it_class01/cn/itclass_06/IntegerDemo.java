package cn.day14.cn.it_class01.cn.it_class01.cn.itclass_06;

/**
 * Created by Gypsophila on 2018/4/8.
 *
 * Integer的构造方法
 *
 * 这个字符串必须有数字字符组成
 *
 *
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //方式一
        Integer ii = new Integer(100);
        System.out.println("i" + ii);

        String s = "100";
        Integer iii = new Integer(s);
        System.out.println(" i " + iii);
    }
}
