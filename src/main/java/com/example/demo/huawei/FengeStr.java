package com.example.demo.huawei;

import java.util.Scanner;

/**
 *
 */
public class FengeStr {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        splitStr(str1);
        splitStr(str2);

    }

    static void splitStr(String str) {

        while (str.length() > 8) {

            System.out.println(str.substring(0, 8));
            str = str.substring(8);
        }

        str = str + "00000000";

        System.out.println(str.substring(0,8));

    }




}
