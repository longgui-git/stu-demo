package com.example.demo.huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class HebingQiuHe {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            String[] split = str.split("\\s+");

            Integer key = Integer.parseInt(split[0]);
            Integer value = Integer.parseInt(split[1]);

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }

        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

    }


}
