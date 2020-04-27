package com.example.demo.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 * 题目描述
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 *
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 *
 * 如，输入： Type 输出： epTy
 *
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 *
 * 如，输入： BabA 输出： aABb
 *
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 *
 *
 * 如，输入： By?e 输出： Be?y
 *
 *
 * 注意有多组测试数据，即输入有多行，每一行单独处理（换行符隔开的表示不同行）
 *
 *
 * 输入描述:
 * 输入字符串
 * 输出描述:
 * 输出字符串
 * 示例1
 * 输入
 * 复制
 * A Famous Saying: Much Ado About Nothing (2012/8).
 * 输出
 * 复制
 * A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).
 */
public class CharSort {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sort(s));

    }


    public static String sort(String str) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean isLow = c >= 'a' && c <= 'z';
            boolean isUp = c >= 'A' && c <= 'Z';
            if (isLow || isUp){
                list.add(c);
            }
        }


        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {

                return toLower(o1).compareTo(toLower(o2));
            }
        });


        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            boolean isLow = c >= 'a' && c <= 'z';
            boolean isUp = c >= 'A' && c <= 'Z';

            if (isLow || isUp) {
                sb.append(list.get(j));
                j++;
            } else {
                sb.append(c);
            }

        }


        return sb.toString();
    }

    public static Character toLower(Character character) {

        char c = character;
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }
        return c;
    }


}
