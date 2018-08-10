package cn.day12.cn.itclass_01.itclass_04;

/**
 * Created by Gypsophila on 2018/3/28.
 */

import java.util.Scanner;

/**
 *
 * 模拟登陆，给三次机会，并提示还有几次
 * 分析：
 *  A：定义用户名和密码 已存在的
 *  B:键盘录入用户名和密码
 *  C:比较用户名和密码
 *      如果都相同，则录取成功
 *      如果有一个不同则登录失败
 *  D:给三次机会，用循环改进最好用for循环
 *
 * */
public class StringTest {
    public static void main(String[] args) {
        final String user = "cjd";
        final String psw = "111";
        for(int i = 1 ; i < 3 ; ++i){
            Scanner sc = new Scanner(System.in);
            String userName = sc.nextLine();
            String passWord = sc.nextLine();
            if(user.equals(userName)&&psw.equals(passWord)){
                System.out.println("login");
                break;
            }else{
                System.out.println("try" + i +"times");
            }
        }
    }
}
