package com.example.demo.huawei;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 */
public class Test {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        forMap(stringBuilder, map);
        System.out.println(stringBuilder);

    }

    public static void forMap(StringBuilder sb, TreeMap<Character, Integer> map ) {


        Iterator<Character> iterator = map.keySet().iterator();
        int flag = 0;
        while (iterator.hasNext()) {
            Character character = iterator.next();
            if (map.get(character) > 0) {
                map.put(character, map.get(character) - 1);
                sb.append(character);
                flag = 1;
            }
        }

        if (flag > 0) {
            forMap(sb, map);
        }

        return;
    }


}
