package cn.day15_Regex.cn.itcast_01;

import java.util.Scanner;

/**
 * Created by Gypsophila on 2018/4/9.
 *
 * 校验qq号码
 *  1：要求必须是5-15位数字
 *  2:0不能开头
 *  分析：
 *      A:键盘录入一个QQ号码
 *      B:写一个功能实现校验
 *      C:调用功能，输出结果
 */
public class RegexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String qq = sc.nextLine();
        System.out.println(checkQQ(qq));
    }

    /**
     *
     * 写一个功能实现校验
     * 两个明确
     * 明确返回值类型：boolean
     * 明确参数列表String qq
     *
     * */


    public static boolean checkQQ(String qq){
        boolean flag = true;
        if(qq.length() <15 || qq.length() >5){

            char[] arr = qq.toCharArray();
            if(!qq.startsWith("0")){

                for (int i = 0; i < arr.length; i++) {
                    if(!Character.isDigit(arr[i]) ){
                        flag = false;
                        break;
                    }
                }
            }else {
                flag = false   ;
            }
        }else {flag = false;}



        return flag;
    }
}
