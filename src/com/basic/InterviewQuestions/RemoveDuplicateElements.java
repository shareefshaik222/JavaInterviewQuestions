package com.basic.InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements {
    public static int[] removeDuplicates(int[] num){
        Set<Integer> uniqueElements=new LinkedHashSet<>();
        for (int numbers:num){
            uniqueElements.add(numbers);
        }
        //convert the set back into array
        int[] results=new int[uniqueElements.size()];
        int index=0;
        for (int number:uniqueElements){
            results[index++]=number;
        }
        return results;

    }

    public static void main(String[] args) {
        int[] number={23,3,5,5,76,7,8,8};
       int[] uniqueSet= removeDuplicates(number);
        System.out.println("Array after removing duplicates:"+ Arrays.toString(uniqueSet));
    }

}
