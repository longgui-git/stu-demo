package com.example.demo.demo;

/**
 * 二分搜索
 */
public class ErFenSearch {

    static int k = 0;

    public static void main(String[] args) {

        int[] coins = {1,2,5,10,11,16,20,45,46,50,67};
        System.out.println(binarySearch2(coins ,51));
        System.out.println(k);

    }

    /**
     * 递归二分
     * @param coins
     * @param left
     * @param right
     * @param target
     * @return
     */
    static int binarySearch(int[] coins ,int left ,int right ,int target) {

        k++;
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (target == coins[mid]) {
            return mid;
        } else if (target > coins[mid]) {
            return binarySearch(coins ,mid+1, right ,target);
        } else if (target < coins[mid]) {
            return binarySearch(coins ,left, mid-1 ,target);
        }

        return -1;
    }


    /**
     * 循环二分
     * @param coins
     * @param target
     * @return
     */
    static int binarySearch2(int[] coins  ,int target) {
        int left = 0;
        int right = coins.length -1;


        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == coins[mid]) {
                return mid;
            } else if (target > coins[mid]) {
                left = mid + 1;
            } else if (target < coins[mid]) {
                right = mid - 1;
            }
        }

        return -1;
    }



}
