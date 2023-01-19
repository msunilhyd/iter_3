package com.sunil.leetcode;

import java.util.Arrays;
import java.util.List;

public class BuySellStock {

    public static int maxProfit(List<Integer> prices) {
        int l = 0;
        int r = 1;

        int maxP = 0;

        while (r < prices.size()) {

            if (prices.get(l) < prices.get(r)) {
                int profit = prices.get(r) - prices.get(l);
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r += 1;
        }
        return maxP;
    }

    public static void main(String[] args) {
        List<Integer> priceList = Arrays.asList(2, 4, 1, 8, 9);
        System.out.println(maxProfit(priceList));
    }
}
