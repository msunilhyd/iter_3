package com.sunil.leetcode;

import java.util.Arrays;

public class MaxContiguousSubArr {

    public static void main(String[] args) {

        int[] arr = {2, 3, -1};

        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i=0; i<size; i++) {

            max_ending_here = max_ending_here + arr[i];
            if(max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        System.out.println(max_so_far);
    }
}
