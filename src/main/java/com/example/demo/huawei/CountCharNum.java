package com.example.demo.huawei;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 统计输入的字符个数
 */
public class CountCharNum {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        HashSet<Character> set = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            set.add(s.charAt(j));
        }
        System.out.println(set.size());

    }


}
