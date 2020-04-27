package com.example.demo.huawei;

import java.util.Scanner;

public class Daoxu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        String[] split = s.split("[^a-zA-Z]+");
        for (int i = split.length-1; i > 0; i--) {
            sb.append(split[i]).append(" ");
        }

        sb.append(split[0]);

        System.out.println(sb);


    }


}
