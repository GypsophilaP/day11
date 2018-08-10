package cn.day12.cn.itclass_01.itclass_04;

/**
 * Created by Gypsophila on 2018/3/28.
 */

/**
 *
 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数
 *
 * */

public class StringTest3 {
    public static void main(String[] args) {
        String str = "Hello World111";
        int numBig = 0 ;
        int numLow = 0 ;
        int num = 0;
        char temp = ' ';
        for(int i = 0 ; i < str.length() ; ++i){
            temp = str.charAt(i);
            if(temp>='a' && temp <='z'){
                numLow++;
            }else if(temp >= '0' && temp <= '9'){
                num++;
            }else if(temp >= 'A' && temp <= 'Z'){
                numBig++;
            }

        }
        System.out.println("big" + numBig + "low" + numLow + "num" + num);
    }
}
