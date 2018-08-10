package cn.day14.cn.it_class01.cn.it_class01.cn.it_class02;

/**
 * Created by Gypsophila on 2018/4/8.
 *
 * 数组排序之选择排序：
 *  从0索引开始，一次和后面元素比较，小的往前方，第一次完毕，最小值出现在了最小索引处
 *
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,4,5,8,7,9};
        sort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void sort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
