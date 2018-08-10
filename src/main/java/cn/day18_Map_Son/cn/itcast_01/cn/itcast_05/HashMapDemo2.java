package cn.day18_Map_Son.cn.itcast_01.cn.itcast_05;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Gypsophila on 2018/5/3.
 *
 * HashMap嵌套HashMap
 * 传智播客
 *      基础班
 *          陈玉楼 20
 *          高月 22
 *      就业班
 *          李杰 21
 *          曹石磊 23
 *
 *
 *
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String,HashMap<String,Integer>> czbk = new HashMap<String,HashMap<String,Integer>>();

        HashMap<String,Integer> jcb = new HashMap<String,Integer>();
        jcb.put("chenyulou",22);
        jcb.put("gaoyue",20);

        HashMap<String,Integer> jyb = new HashMap<String,Integer>();
        jcb.put("chenyulou",22);
        jcb.put("gaoyue",20);

        czbk.put("jichuban",jcb);
        czbk.put("jichuban",jyb);

        Set<String> czbkSet = czbk.keySet();
        for (String key :
                czbkSet) {
            HashMap<String,Integer> czbkValue = czbk.get(key);
        }



    }
}
