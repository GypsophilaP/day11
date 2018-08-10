package cn.day14.cn.it_class01.cn.it_class01;

/**
 * Created by Gypsophila on 2018/4/3.
 * 冒泡排序
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {3,6,2,6,11,4};
        bubbleSort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i <arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
