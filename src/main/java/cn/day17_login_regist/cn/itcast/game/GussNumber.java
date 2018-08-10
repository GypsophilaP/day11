package cn.day17_login_regist.cn.itcast.game;

import java.util.Scanner;

/**
 * Created by Gypsophila on 2018/4/27.
 */
public class GussNumber {
    private GussNumber() {
    }
    public static void start(){
        int number = (int)(Math.random()*100) +1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("enter");

        int gussNumber = sc.nextInt();
        if (gussNumber > number){
            count++;
            System.out.println("bigger");
        }else if (gussNumber<number){
            System.out.println("smaller");
            count++;
        }else{
            System.out.println("bingo");
            count++;
        }
    }
}
