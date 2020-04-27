package com.example.demo.demo;

import java.util.*;

/**
 * 素数以及动态规划
 *
 *
 */
public class SuShu {

    public static HashMap<String, Integer> map = new HashMap<>();


    public static void main(String[] args) {


        boolean[] sushu = sushu(60000);

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int n = Integer.parseInt(s);

        String s2 = scanner.nextLine();
        String[] split = s2.split("\\s+");
        LinkedList<Integer> list = new LinkedList<>();
        for (String s1 : split) {
            list.add(Integer.parseInt(s1));
        }

        // 偶数部分
        ArrayList<Integer> evens = new ArrayList<>();
        // 奇数部分
        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            // 偶数
            if (list.get(i) % 2 == 0) {
                evens.add(list.get(i));
            } else { // 奇数
                odds.add(list.get(i));
            }
        }

        int[] evensMatch = new int[evens.size()];
        int result = 0;
        for (int i = 0; i < odds.size(); i++) {
            int[] used = new int[evens.size()];
            if (find(odds.get(i), evens, used, evensMatch)) {
                result++;
            }
        }

        System.out.println(result);


//        long t1 = System.currentTimeMillis();
//        int look = look(list, sushu);
//        System.out.println(System.currentTimeMillis() - t1);
//        System.out.println(look);


    }


    private static boolean isPrime(long num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
            if (num == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean find(int x, ArrayList<Integer> evens, int[] used, int[] evensMatch) {
        int j;
        for (j = 0; j < evens.size(); j++) {
            if (isPrime(x + evens.get(j)) && used[j] == 0) {
                used[j] = 1;
                if (evensMatch[j] == 0 || find(evensMatch[j], evens, used, evensMatch)) {
                    evensMatch[j] = x;
                    return true;
                }
            }
        }
        return false;
    }






    /**
     * @param list
     * @param sushu
     * @return
     */
    static int look(List<Integer> list, boolean[] sushu) {


        if (list.size() == 0) {
            return 0;
        }

        String str = new StringBuilder().append(list).toString();
        if (map.containsKey(str)) {
            return map.get(str);
        }

        int max = 0;

        int x1 = list.get(0);
        for (int j = 1; j < list.size(); j++) {
            int res = 0;
            Integer x2 = list.get(j);

            LinkedList<Integer> otherList = new LinkedList<>(list);
            otherList.remove(j);
            otherList.remove(0);


            if (sushu[x1 + x2]) {
                res = Math.max(res, 1 + look(otherList, sushu));
            } else {
                res = Math.max(res, look(otherList, sushu));
            }

            max = Math.max(max, res);

        }

        map.put(str, max);

        return max;

    }


    static boolean[] sushu(int n) {

        boolean[] isPrim = new boolean[n];
        // 将数组都初始化为 true
        Arrays.fill(isPrim, true);

        for (int i = 2; i * i < n; i++) {
            if (isPrim[i]) {
                // i 的倍数不可能是素数了
                for (int j = 2 * i; j < n; j += i) {
                    isPrim[j] = false;
                }

            }

        }

        return isPrim;

    }


}
