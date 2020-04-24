package com.example.demo.huawei;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class QuChongSort {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            Set<Integer> set = new HashSet<>();
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                set.add(scanner.nextInt());
            }

            // 去重
            int[] arr = new int[set.size()];
            int i = 0;
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()){
                arr[i++] = iterator.next();
            }

            quickSort(arr,0,arr.length-1);

            for (int data : arr) {
                System.out.println(data);
            }
        }



    }

    public static void quickSort(int arr[] ,int left ,int right) {

        if (left >= right) {
            return;
        }

        int i = left, j = right;

        int temp = arr[left];

        while (i != j) {

            while (arr[j] >= temp && j > i) {
                j--;
            }
            while (arr[i] <= temp && j > i) {
                i++;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        arr[left] = arr[i];
        arr[i] = temp;

        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);

    }


}
