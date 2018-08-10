package cn.day16_JDK5News.cn.itcast_01;

/**
 * Created by Gypsophila on 2018/4/25.
 *
 * JDK5的新特性：自动拆装箱，泛型，增强for，金泰倒入，可变参数，枚举
 *
 * 增强for:是for循环的一种
 * 格式：
 *      for(元素数据类型 变量： 数组或者Collection集合){
 *          使用变量即可，该变量就是元素
 *      }
 *  好处：简化了数组和集合的遍历
 *
 *
 *  弊端：增强for的目标不能为null
 *  对增强for的部分先进行不为null的判断
 *
 *  增强for其实是用来替代迭代器的
 *
 */
public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int x:arr
             ) {
            System.out.println(x);
        }
    }
}
