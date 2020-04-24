package com.example.demo.huawei;

import java.util.*;

public class JinZhiConvert {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String str = Integer.toString(n, 2);
        int i = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '1') {
                i++;
            }
        }
        System.out.println(i);

    }


}
