package com.sunil.leetcode;

public class CoinChange {

    public static void main(String[] args) {

        int[] coins = {1, 2, 3};
        int sum = 2;

        int totalCoins = coins.length;

        // Creating array which stores subproblems' solutions
        double[][] arr = new double[totalCoins + 1][sum + 1];

        // Initializing first row with +ve infinity
        for (int j=0; j<=sum; j++) {
            arr[0][j] = Double.POSITIVE_INFINITY;
        }

        // Initializing the first column with 0
        for (int i=1; i<=totalCoins; i++) {
            arr[i][0] = 0;
        }

        // Implementing the recursive solution
        for (int i=1; i<=totalCoins; i++) {
            for (int j=1; j<=sum; j++) {
                if (coins[i - 1] <= j)
                    arr[i][j] = Math.min(1 + arr[i][j - coins[i - 1]], arr[i - 1][j]);
                else
                    arr[i][j] = arr[i - 1][j];
            }
        }
        System.out.println("No. of coins needed is :- " + arr[totalCoins][sum]);
    }
}
