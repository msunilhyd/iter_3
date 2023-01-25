package com.sunil.leetcode;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int res = 0;
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int area = (r - l) * Math.min(arr[l], arr[r]);
            res = Math.max(res, area);

            if (arr[l] < arr[r])
                l = l + 1;
            else
                r = r - 1;
        }

        System.out.println(res);
    }
}
