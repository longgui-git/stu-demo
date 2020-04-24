package com.example.demo.demo;

import cn.hutool.core.util.ArrayUtil;

/**
 * 快排
 */
public class QuickSort {

    static int k = 0;

    public static void main(String[] args) {

        int[] arr = {3 ,4, 4, 2, 7};
        quickSort(arr,0,4);

        System.out.println(k);

    }

    static void quickSort(int arr[], int low, int high) {

        int temp = arr[low];
        int i = low;
        int j = high;
        if (i > j) {
            return;
        }

        while (i < j) {

            while (arr[j] >= temp && i < j) {
                j--;
            }
            while (arr[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                ArrayUtil.swap(arr, i, j);
            }

        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);

    }


}
