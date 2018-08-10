package cn.day17_Set_Son;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Gypsophila on 2018/4/27.
 *
 * Colletion
 *      \--List
 *          有序：（存储顺序和取出顺序一致），可重复
 *       \--Set
 *          无序：（存储顺序和取出顺序不一致），唯一
 *          注意：虽然Set集合的元素无序，但是作为集合来说，他肯定有自己的存储顺序，而你的顺序恰好和他的存储顺序一致，
 *          这代表不了有序，你可以多鵆一些数据，就能看到效果
 *
 * HashSet：他不保证set的迭代顺序；特别是他不保证该顺序恒久不变
 *
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");
        set.add("java");
        for (String s :
                set) {
            System.out.println(s);
        }


    }
}
