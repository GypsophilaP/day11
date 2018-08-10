package cn.day18_Collections.cn.itcast_01.cn.itcast_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by Gypsophila on 2018/5/7.
 *
 * 思路：
 *      A:创建一个HashMap集合
 *      B:创建一个ArrayList集合
 *      C:创建花色数组和点数数组
 *      D:从0开始存储编号，并存储对应的牌
 *          同时往ArrayList里面存储编号即可
 *      E:洗牌（编号）
 *      F:发牌（发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收）
 *      G:看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）
 *
 */
public class PokerDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = { "3" , "4" , "5" , "6" , "7" , "8" , "9" ,"10" , "J" , "Q" , "K","A" , "2" };
        int index = 0;
        for(String number:numbers){
            for (String color :
                    colors) {
                String poker = color.concat(number);
                map.put(index,poker);
                list.add(index++);
            }
        }
        map.put(index,"xiaowang");
        list.add(index++);
        map.put(index,"dawang");
        list.add(index++);

        Collections.shuffle(list);

        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        for(int x = 0 ; x < list.size(); ++x){
            if(x >= list.size() - 3){
                dipai.add(list.get(x));
            }
            if(x%3 == 0){
                player1.add(list.get(x));
            }else if(x%3 == 1){
                player2.add(list.get(x));
            }else{
                player3.add(list.get(x));
            }
        }
        lookPoker("player1",player1,map);

    }
    public static void lookPoker(String name,TreeSet<Integer> set,HashMap<Integer,String> map){
        System.out.println(name);
        for (Integer key: set
             ) {
            System.out.println(map.get(key));
        }
        
    }
}
