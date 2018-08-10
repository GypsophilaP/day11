package cn.day16_List_test.cn.itCast_01.cn.itcast_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Gypsophila on 2018/4/25.
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 *
 * 分析：
 * A:创建键盘录入数据对象
 *      A:键盘录入多个数据，我们不知道多少个，所以用集合存储
 *      B:以0结束，判断0
 *      C：吧集合转成数组
 *      D:对数据排序
 *      E:获取该数组中的最大索引的值
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int temp;
        while(sc.hasNext()){
            temp = sc.nextInt();
            if(temp!=0){
                array.add(temp);
            }else{
                Integer[] arr = new Integer[array.size()];
                array.toArray(arr);
                Arrays.sort(arr);
                System.out.println(arr[arr.length-1]);
            }
        }
    }
}
