package com.basic.InterviewQuestions;

public class FindingMaxAndMinInArray {
    public static void main(String[] args) {
        int[] numbers={13,27,4,5,67,9};
        int max=numbers[0];
        int min=numbers[0];
        for (int num:numbers){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;

            }
        }
        System.out.println("The smallest number in the Array is "+min);
        System.out.println("The largest number in the Array is "+max);

    }
}
