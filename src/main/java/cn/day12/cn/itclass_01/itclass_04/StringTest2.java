package cn.day12.cn.itclass_01.itclass_04;

/**
 * Created by Gypsophila on 2018/3/28.
 */

import java.util.Scanner;

/**
 *
 * 需求：遍历获取字符串中的每一个字符
 *
 *
 * */


public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0 ; i < str.length();++i){
            System.out.println(str.charAt(i));
        }
    }
}
