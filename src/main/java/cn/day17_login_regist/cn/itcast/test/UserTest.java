package cn.day17_login_regist.cn.itcast.test;

import cn.day17_login_regist.cn.itcast.dao.UserDao;
import cn.day17_login_regist.cn.itcast.impl.UserDaoImpl;
import cn.day17_login_regist.cn.itcast.pojo.User;

import java.util.Scanner;

/**
 * Created by Gypsophila on 2018/4/27.
 *
 * x新增加了两个小问题
 * A:多个对象共享同一个成员变量，用静态
 * B:循环里面如果有switch break结束的是switch语句
 *
 */
public class UserTest {
    public static void main(String[] args) {
        System.out.println("--------------");
        System.out.println("1 sign in");
        System.out.println("2 sign up");
        System.out.println("3 exit");
        System.out.println("please enter your choice");

        Scanner sc = new Scanner(System.in);

        String choiceString = sc.nextLine();
        String newUsername = null;
        String newPassworld = null;
        User user = new User();
        UserDao ud = new UserDaoImpl();
        switch (choiceString){
            case "1":
                System.out.println("welcome");
                newUsername = sc.nextLine();
                newPassworld = sc.nextLine();
                user.setPassword(newPassworld);
                user.setUsername(newUsername);
                if(ud.isLogin(user.getUsername(),user.getPassword())){
                    System.out.println("true");
                }else{
                    System.out.println("fales");
                }
                break;
            case "2":
                System.out.println("welcome");
                newUsername = sc.nextLine();
                newPassworld = sc.nextLine();
                user.setPassword(newPassworld);
                user.setUsername(newUsername);

                ud.regist(user);

                break;
            case "3":

            default:
                System.out.println("exit");
                break;
        }
    }
}
