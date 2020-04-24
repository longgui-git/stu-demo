package com.example.demo.huawei;

import java.util.Scanner;

public class SiSheWuRu {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextFloat()) {
            float v = scanner.nextFloat();
//            int data = (int) v;
//            int result = (v - data) >= 0.5 ? data + 1 : data;
            System.out.println(round(v));
        }

    }


    public static int round(float data) {

        return Math.round(data);
    }

}
