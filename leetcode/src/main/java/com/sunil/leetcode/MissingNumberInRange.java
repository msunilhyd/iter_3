package com.sunil.leetcode;

public class MissingNumberInRange {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4};

        int res = 0;

        for (int i=0; i<arr.length; i++) {
            res = res + (i - arr[i]);
        }
        System.out.println(res);
    }
}
