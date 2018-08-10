package cn.day14.cn.it_class01.cn.it_class01.cn.itclass_07;

/**
 * Created by Gypsophila on 2018/4/8.
 *
 * int 类型和String类型的相互转换
 * int -- String
 * String -- int
 *
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int number = 100;
        String s1 = "" + number;
        System.out.println("s1" + s1);

        String s2 = String.valueOf(number);
        System.out.println("s2" + s2);

        Integer i = new Integer(number);
        String s3 = i.toString();
        System.out.println("s3" + s3);

        String s4 = Integer.toString(number);
        System.out.println("s4" + s4);


        //String -- int
        String s = "100";
        Integer ii = new Integer(s);
        int x = ii.intValue();
        System.out.println("x "  + x);

        int y = Integer.parseInt(s);
        System.out.println("y" + y);

        //十进制转换到其他进制
        System.out.println(Integer.toString(100,16));

        //其他进制转换到10进制
        System.out.println(Integer.parseInt("100",16));




    }
}
