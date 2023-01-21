package com.sunil.leetcode;

public class SearchInRotatedSortedArr {

    public static void main(String[] args) {

        int[] a = {4, 5, 6, 7, 8, 0, 1, 2};
        int target = 1;
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int mid = (l+r) / 2;
            if (a[mid] == target) {
                System.out.println(target + " found at index :- "+ mid);
                return;
            }
            if (a[l] < a[mid]) {
                if (target < a[l] || target > a[mid])
                    l = mid + 1;
                else
                    r = mid -1;
            }
            else {
                if (target > a[r] || target < a[mid])
                    r = mid -1;
                else
                    l = mid + 1;
            }
        }
        System.out.println("Not found");
    }
}
