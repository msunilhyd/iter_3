package com.sunil.leetcode;

import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {

    public static void productExceptSelf(List<Integer> inputList) {

        int n = inputList.size();
        int product = 1;

        for (int i = 0; i < n; i++) {
            product = product * inputList.get(i);
        }

        int[] ansArr = new int[n];
        for (int i = 0; i < n; i++) {
            ansArr[i] = product / inputList.get(i);
        }
        System.out.println(Arrays.toString(ansArr));
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3);
        productExceptSelf(inputList);
    }
}
