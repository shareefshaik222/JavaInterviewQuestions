package com.basic.java.interview.questions;

import java.util.HashSet;

public class PrintDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5,2,3,4,5};
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Duplicate elements: ");
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }
    }

}
