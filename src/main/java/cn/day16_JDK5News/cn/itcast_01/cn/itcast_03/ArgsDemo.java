package cn.day16_JDK5News.cn.itcast_01.cn.itcast_03;

/**
 * Created by Gypsophila on 2018/4/25.
 *
 * 可变参数：定义方法是不知道该使用多少个参数
 *      格式：
 *          修饰符 返回值类型 方法名(数据类型... 变量名){}
 *          注意：这里的变量时数组
 *
 *
 */
public class ArgsDemo {
    public static void main(String[] args) {
        //求和
        int a = 10;
        int b = 20;
        int result = a+b;
    }

    public static int Sum(int a , int b){
        return a + b;
    }

    public static int Sum(int a , int b,int c){
        return a + b + c;
    }

    public static int sum(int... a){
        return 0;
    }
}
