package cn.day15_Regex.cn.itcast_01.cn.itcast_02;

import java.util.Scanner;

/**
 * Created by Gypsophila on 2018/4/9.
 *
 *  判断功能
 *      String类的public boolean matches(String regex)
 *
 *      需求：
 *          判断手机号码是否满足要求
 *      分析：
 *          A:键盘录入手机号码
 *          B:定义手机号码的规则
 *          C:调用功能，判断即可
 *          D:输出结果
 *
 */
public class RegxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNumber = sc.nextLine();
        System.out.println(phoneNumber.matches("1[38]\\d{9}"));



    }
}
