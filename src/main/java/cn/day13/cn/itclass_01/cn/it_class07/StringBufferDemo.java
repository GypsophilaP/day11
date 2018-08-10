package cn.day13.cn.itclass_01.cn.it_class07;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Gypsophila on 2018/4/3.
 *
 *
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        String str = sb.toString();
        System.out.println(str);
        //int[] arr = new int()[1,2,3,4,5];
        String str2 = "qwertyyu";
        StringBuffer sb2 = new StringBuffer(str2);
        System.out.println(sb2.reverse());

        String str3 = new String("aassddffddssaa");
        StringBuffer sb3 = new StringBuffer(str3);
        System.out.println(ifSymmetrica(sb3));

    }

    public static boolean ifSymmetrica(StringBuffer sb){
        if(sb.length()%2 == 0){
            String str1 = sb.substring(0,sb.length()/2);
            String str2 = sb.substring(sb.length()/2 );
            boolean b =  sb.substring(0,sb.length()/2).equals(new StringBuffer(sb.substring(sb.length()/2 )).reverse().toString());
            if(b){
                return true;
            }
        }



        return false;
    }
}
