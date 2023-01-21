package com.sunil.leetcode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {7, 12, 3, 1, 2, -6, 5, -8, 6};

        int target = 0;

        List<Integer[]> result = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            int currentTarget = target - arr[i];
            Set<Integer> existingNums = new HashSet<>();
            for (int j=i+1; j<arr.length; j++) {
                if (existingNums.contains(currentTarget - arr[j])) {
                    result.add(new Integer[] { arr[i], arr[j], currentTarget - arr[j] });
                } else {
                    existingNums.add(arr[j]);
                }
            }
        }
        for (Integer[] a: result) {
            System.out.println(Arrays.toString(a));
        }
    }
}
