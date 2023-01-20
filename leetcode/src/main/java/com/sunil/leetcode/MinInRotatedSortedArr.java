package com.sunil.leetcode;

public class MinInRotatedSortedArr {

    public static void main(String[] args) {

        int[] arr = {4, 6, 7, 1, 2, 3};

        int res = arr[0];

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            if (arr[l] < arr[r]) {
                res = Math.min(res, arr[l]);
                break;
            }
            int m = (l + r) / 2;
            if (arr[l] < arr[m])
                l = m + 1;
            else
                r = m - 1;
        }
        System.out.println(res);
    }
}
