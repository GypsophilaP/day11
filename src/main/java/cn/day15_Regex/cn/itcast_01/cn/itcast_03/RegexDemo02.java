package cn.day15_Regex.cn.itcast_01.cn.itcast_03;

/**
 * Created by Gypsophila on 2018/4/10.
 */
public class RegexDemo02 {
    public static void main(String[] args) {
        String s1 = "aa,bb,cc";
        String regxe = ",";
        String[] strs = s1.split(regxe);

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        for (String x :
                strs) {
            System.out.println(x);
        }
    }
}
