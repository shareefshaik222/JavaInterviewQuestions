package com.basic.InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonValuesInArrays {
    public static void main(String args[]) {
        Integer[] a1 = {1, 2, 3, 1, 2};
        Integer[] a2 = {1, 2, 3};
        Integer[] a3 = {1, 2, 3, 4};
        Set<Integer> common = findCommonElements(a1, a2, a3);
        System.out.println(common);


    }

    public static Set<Integer> findCommonElements(Integer[] a1, Integer[] a2, Integer[] a3) {
        //set the first array as the base set
        Set<Integer> common = new HashSet<>(Arrays.asList(a1));
        //retain only the commom values
        common.retainAll(new HashSet<>(Arrays.asList(a2)));
        common.retainAll(new HashSet<>(Arrays.asList(a3)));
        return common;
    }
}