package com.example.demo.demo;

import java.util.HashMap;

/**
 * 滑动窗口
 */
public class HuaDongWindow {

    static int k = 0;

    public static void main(String[] args) {

        String s = "ADOBECOHEFJKHWKDHWKHKWHKJHJKEWRKJWEKAHSIUHFJKSKWADEBANC";
        String t = "ABCE";

        System.out.println(minWindow(s, t));
        System.out.println(minWindow2(s, t));
        System.out.println(k);

    }

    /**
     * 暴力破解法
     * @param s
     * @param t
     * @return
     */
    static String minWindow(String s ,String t) {

        HashMap<Character, Integer> needs = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            needs.put(c, needs.getOrDefault(c, 0)+1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + t.length(); j <= s.length(); j++) {
//                k++;
                String reStr = s.substring(i, j);
                boolean b = checkHave(reStr, needs);
                if (b && (reStr.length() < result.length() || result.equals(""))) {
                    result = reStr;
                }

            }

        }

        return result;
    }


    /**
     * 窗口移动
     * @param s
     * @param t
     * @return
     */
    static String minWindow2(String s ,String t) {

        HashMap<Character, Integer> needs = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            needs.put(c, needs.getOrDefault(c, 0)+1);
        }

        String result = "";

        for (int i = 0 ,j = i+t.length(); i < s.length() && j<= s.length();) {
                k++;
                String reStr = s.substring(i, j);
                boolean b = checkHave(reStr, needs);
            if (b) {
                i++;
            }else {
                j++;
            }

            if (b && (reStr.length() < result.length() || result.equals(""))) {
                result = reStr;
            }


        }

        return result;
    }



    static boolean checkHave(String s ,HashMap<Character, Integer> needs) {

        HashMap<Character, Integer> source = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            source.put(c, source.getOrDefault(c, 0)+1);
        }

        for (Character c : needs.keySet()) {
            if (source.getOrDefault(c, 0) < needs.get(c)) {
                return false;
            }
        }

        return true;
    }


}
