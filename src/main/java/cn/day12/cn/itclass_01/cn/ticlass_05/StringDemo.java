package cn.day12.cn.itclass_01.cn.ticlass_05;

/**
 * Created by Gypsophila on 2018/4/2.
 */
public class StringDemo {
    public static void main(String[] args) {
        //定义一个字符串对象
        String s = "JavaSE";
        byte[] bys = s.getBytes();
        for (int i = 0; i < bys.length; i++) {
            System.out.println(bys[i]);
        }

        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        String ss = String.valueOf(chs);
        System.out.println(ss);



    }
}
