package com.example.demo.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 零钱凑整
 */
public class CoinCount {

    static int k = 0;



    // 避免重复计算，
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        int[] coins = {1,2,5,10,20,50};
        System.out.println(coinCharge(coins ,1));
        System.out.println(k);

    }

    static int coinCharge(int[] coins ,int amount) {

        k++;
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        if (map.get(amount) != null) {
            return map.get(amount);
        }

        int res = Integer.MAX_VALUE;

        for (int coin : coins) {

            int subRes = coinCharge(coins, amount - coin);
            if (subRes == -1) {
                continue;
            }
            res = Math.min(res, 1 + subRes);
        }

        map.put(amount, res);
        return res;
    }


    static int coinCharge2(int[] coins ,int amount) {


        int[] dp = new int[amount + 1];

        dp[0] = 0;

        for (int i = 0; i < dp.length; i++) {

            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(amount+1, dp[i - coin]+1);
                k++;
            }

        }

        return dp[amount] == (amount+1)? -1 : dp[amount];
    }


}
