package com.sunil.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(List<Integer> inputList) {

        Set<Integer> mySet = new HashSet<Integer> ();

        for(Integer n:inputList) {
            if (inputList.contains(n))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 4, 3, 2);
        System.out.println(containsDuplicate(inputList));
    }
}
