package com.basic.InterviewQuestions;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        String str="Automation";
        String reversed=new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
        int[] arr ={3,6,2,5,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
