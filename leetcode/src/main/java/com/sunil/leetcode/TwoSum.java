package com.sunil.leetcode;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Solution soln = new Solution();
        Integer[] inputArr = { 1, 2, 5, 7, 8, 4};
        List<Integer> inputList = Arrays.asList(inputArr);
        System.out.println(soln.twoSum(inputList, 9));
    }
}

class Solution {

    public List<Integer> twoSum(List<Integer> inputList, int target) {

        Map<Integer, Integer> prevMap = new HashMap<Integer, Integer>();

        for (int i=0; i<inputList.size(); i++) {
           int curVal = inputList.get(i);
           int diff = target - curVal;

           if (prevMap.containsKey(curVal)) {
               System.out.println(curVal +", "+ diff);
           }
           prevMap.put(diff, curVal);
        }

        return Arrays.asList(0);
    }
}