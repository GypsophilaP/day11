package cn.day14.cn.it_class01.cn.it_class01.cn.itclass_04;

/**
 * Created by Gypsophila on 2018/4/8.
 *
 * 二分查找
 *
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        System.out.println(search(arr,44,arr.length,0));
        System.out.println(search(arr,24,arr.length,0));
    }

    public static int search(int[] arr,int x,int max,int min){
        int mid = (max + min)/2;
        if(max < min){return -1;}
        if(x == arr[mid]){
            return mid;
        }else if(x > arr[mid]){
            return search(arr,x,max,mid + 1);
        }else if(x < arr[mid]){
            return search(arr,x,mid-1,min);
        }else{return -1;}
    }

}
