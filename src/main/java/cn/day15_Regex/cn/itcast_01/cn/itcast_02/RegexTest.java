package cn.day15_Regex.cn.itcast_01.cn.itcast_02;

import java.util.Scanner;

/**
 * Created by Gypsophila on 2018/4/10.
 *
 * 校验邮箱
 * 分析：
 *          A:键盘录入邮箱号码
 *          B:定义手机号码的规则
 *          C:调用功能，判断即可
 *          D:输出结果
 *
 */
public class RegexTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mail = sc.nextLine();
        String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
        boolean flag = mail.matches(regex);
        System.out.println("flag:"+flag);
    }
}
