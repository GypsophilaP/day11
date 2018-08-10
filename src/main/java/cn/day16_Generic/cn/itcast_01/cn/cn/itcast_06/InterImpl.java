package cn.day16_Generic.cn.itcast_01.cn.cn.itcast_06;

/**
 * Created by Gypsophila on 2018/4/25.
 *
 * 实现类在实现接口的时候
 * 第一种情况：已经知道该是什么类型的了
 * 第二种顶框：还不知道是什么类型的
 *
 */
public class InterImpl<T> implements Inter<T>{
    public void show(T t) {
        System.out.println(t);
    }
}
