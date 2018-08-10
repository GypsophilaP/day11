package cn.day13.cn.itclass_01.cn.itclass_02;

/**
 * Created by Gypsophila on 2018/4/3.
 */

/**
 *
 * StringBuffer的添加功能:
 *  public StringBuufer append(String str):可以吧任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
 *
 * */
public class StringBufferDemo {
    public static void main(String[] args) {
        //擦黄健字符串缓冲区对象
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = sb1.append("hello");
        System.out.println(sb2);
    }
}
