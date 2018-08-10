package cn;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Gypsophila on 2018/5/3.
 */
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.canPlaceFlowers(new int[]{0,0,0,0,1},3);
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int canPlanted = 0;


        int index = 0;
        for(int i = index; i < flowerbed.length ; ++i){
            if(flowerbed[i] == 0){

                count++;
            }else if(flowerbed[i] == 1){
                canPlanted = canPlanted + count/2;
                count = 0;
                index = 1;
                break;
            }
        }

        for(int i = index ; i < flowerbed.length ; ++i){
            if(flowerbed[i] == 0){

                count++;
            }else if(flowerbed[i] == 1){

                canPlanted = canPlanted + (count - 1)/2;
                count = 0;
            }
        }
        canPlanted = canPlanted + count/2;

        return n > canPlanted? false:true;

    }
}
