package com.example.demo.huawei;

import java.util.HashSet;
import java.util.Scanner;


public class QuChong {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        String s = scanner.nextLine();
        for (int i = s.length()-1; i >= 0 ; i--) {
            Character c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }

        }

        System.out.println(sb);

    }


}
