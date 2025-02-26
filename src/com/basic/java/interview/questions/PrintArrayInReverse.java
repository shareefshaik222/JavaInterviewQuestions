package com.basic.java.interview.questions;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

}
