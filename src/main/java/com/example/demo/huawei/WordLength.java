package com.example.demo.huawei;

import java.util.Scanner;

/**
 *
 */
public class WordLength {


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        String str = scanner.nextLine();
//
//        str = str.trim();
//        int index = str.lastIndexOf(' ');
//        System.out.println(str.substring(index+1).length());

        pipei();


    }

    public static void pipei() {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String cs = scanner.next();
        char c = cs.charAt(0);

        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                num++;
            }
        }

        System.out.println(num);
    }




}
