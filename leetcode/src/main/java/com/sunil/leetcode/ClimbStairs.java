package com.sunil.leetcode;

public class ClimbStairs {

    public static void main(String[] args) {

        int one = 1;
        int two = 1;

        int n = 3;

        for (int i=0; i<n-1; i++) {
            int temp = one;
            one = one + two;
            two = temp;
        }
        System.out.println(one);
    }
}
