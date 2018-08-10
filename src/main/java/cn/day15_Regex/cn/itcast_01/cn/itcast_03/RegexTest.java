package cn.day15_Regex.cn.itcast_01.cn.itcast_03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * 字符串排序“91 27 46 38 50”
 *
 */
public class RegexTest {
    public static void main(String[] args) {
        String str1 = "91 27 46 38 50";
        String[] strArr = str1.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        for (int x :
                arr) {
            sb.append(x).append(" ");
            System.out.println(x);
        }
        String res = sb.toString().trim();
        System.out.println(res);
    }
}
