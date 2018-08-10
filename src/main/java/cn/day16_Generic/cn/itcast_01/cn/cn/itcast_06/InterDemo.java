package cn.day16_Generic.cn.itcast_01.cn.cn.itcast_06;

/**
 * Created by Gypsophila on 2018/4/25.
 */
public class InterDemo {
    public static void main(String[] args) {
        Inter<String> i = new InterImpl();
        i.show("hello");
    }
}
