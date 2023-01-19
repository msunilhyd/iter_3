package com.sunil.leetcode;

import java.util.Arrays;
import java.util.List;

public class MaxSubArray {

    public static void maxSubArray(List<Integer> inputList) {

        // [1, 2, -3, 4, 5]

        int curSum = 0;
        int maxSubSum = inputList.get(0);

        for (int n: inputList) {
            if (curSum < 0)
                curSum = 0;
            curSum = curSum + n;
            maxSubSum = Math.max(maxSubSum, curSum);
        }
        System.out.println(maxSubSum);
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);
        maxSubArray(inputList);
    }
}
