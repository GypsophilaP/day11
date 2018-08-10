package cn.day18_Collections.cn.itcast_01.itcast_03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Gypsophila on 2018/5/7.
 *
 * 模拟斗地主洗牌发牌
 * 分析：
 *      A:创建一个派和
 *      B:装牌
 *      C:洗牌
 *      D:发牌
 *      E:看牌
 *
 */
public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"A" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" ,"10" , "J" , "Q" , "K"};
        for (String color:colors
             ) {
            for (String num :
                    numbers) {
                array.add(color.concat(num));
            }

        }

        array.add("smallJoker");
        array.add("bigJoker");

        Collections.shuffle(array);

        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for(int x = 0 ; x < array.size(); ++x){
            if(x >= array.size() - 3){
                dipai.add(array.get(x));
            }
            if(x%3 == 0){
                player1.add(array.get(x));
            }else if(x%3 == 1){
                player2.add(array.get(x));
            }else{
                player3.add(array.get(x));
            }
        }
        lookPoker(player1,"player1");
        lookPoker(player2,"player2");
        lookPoker(player3,"player3");


    }

    public static void lookPoker(ArrayList<String> array,String name){
        System.out.println(name);
        for (String str :
                array) {
            System.out.println(str);
        }
    }
}
