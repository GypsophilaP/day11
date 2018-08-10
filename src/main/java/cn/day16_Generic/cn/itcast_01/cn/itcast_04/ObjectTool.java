package cn.day16_Generic.cn.itcast_01.cn.itcast_04;

/**
 * Created by Gypsophila on 2018/4/25.
 *
 * 泛型类：把泛型定义在类上
 *
 */
public class ObjectTool<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
