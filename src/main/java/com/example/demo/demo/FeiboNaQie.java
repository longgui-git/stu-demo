package com.example.demo.demo;

import java.util.*;

/**
 * 斐波那契数列
 *
 * https://labuladong.github.io/ebook/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92%E7%B3%BB%E5%88%97/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92%E8%AF%A6%E8%A7%A3%E8%BF%9B%E9%98%B6.html
 */
public class FeiboNaQie {

    static int i = 0;

    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(fib2(20));

        System.out.println(i);

    }


    public static int fib(int n) {

        i++;

        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     *
     * 记录以及计算过的
     * @param n
     * @return
     */
    static int fib2(int n) {


        if (n == 1 || n == 2) {
            return 1;
        }

        if (map.get(n) != null) {
            return map.get(n);
        }

        map.put(n, fib2(n - 1) + fib2(n - 2));
        i++;
        return map.get(n);
    }



}


