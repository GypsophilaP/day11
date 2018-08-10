package cn.day16_List_Sun.cn.itcast_01.cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gypsophila on 2018/4/24.
 *
 * ArrayList去除集合中重复的元素
 * 分析：
 *      A:创建集合对象
 *      B:添加多个字符串元素（包含内容相同的）
 *      C:创建新集合
 *      D:遍历旧集合获取每一个元素
 *      E：那这个元素去新集合找，看看有没有
 *              有：不管
 *              没有：添加到心机和
 *      F:遍历新集合
 *
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrs= new ArrayList<String>();
        arrs.add("hello");
        arrs.add("world");
        arrs.add("java");
        arrs.add("hello");
        arrs.add("world");
        arrs.add("java");
        ArrayList<String> arrs2 = new ArrayList<String>();
        arrs2.add(arrs.get(0));
        int flag = 0;
        for (int i = 0; i < arrs.size(); i++) {
            for (int j = 0; j < arrs2.size(); j++) {
                if (arrs.get(i)==arrs2.get(j)){
                    flag = 1;
                }
            }
            if(flag != 1){
                arrs2.add(arrs.get(i));

            }flag = 0;
        }

        Iterator<String> it = arrs2.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
