package com.basic.InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElementsInArray {
    public static void printDuplicateElements(int[] num){
        System.out.println("The array elements:"+ Arrays.toString(num));
        // Create a HashSet to track unique elements
        Set<Integer> hs=new HashSet<>();
        for (int i=0;i<num.length;i++){
            if(hs.add(num[i])==false){
                System.out.println(num[i]+"\t");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 3, 2};
       printDuplicateElements(array);

    }
}
