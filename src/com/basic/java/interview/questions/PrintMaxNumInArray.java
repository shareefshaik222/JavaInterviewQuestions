package com.basic.java.interview.questions;

import java.util.Arrays;

public class PrintMaxNumInArray {
    public static void main(String[] args) {
        int[] num={2,3,4,6,7,8,7};
        int maxnum=printMaxnum(num);
        System.out.println("Max number is "+maxnum);
        int minNum=printMinNum(num);
        System.out.println("The smallest num is:"+minNum);
        int sum=sumOfArrayElements(num);
        System.out.println("The sum of elements:"+sum);
        sortElementsInAscendingOrder();
        secondLargestElement(num);
        secondSmallestElement(num);
        oddAndEvenNumbersInArray(num);
        removeSpacesInString();
        stringISImmutable();
        numberOfWordsInString();
        isPalindrome();
        reverseString();




    }
    public static int printMinNum(int[] arr){
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }

        }
        return min;
    }
    public static int sumOfArrayElements(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;

        }
        return sum;
    }
    public static int printMaxnum(int[] arr){
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
return max;
    }
    public static void sortElementsInAscendingOrder(){
        int[] arr={2,9,3,4,1,5,6};
        Arrays.sort(arr);
        System.out.println("The sorted array is:"+Arrays.toString(arr));

    }
    public static void secondLargestElement(int[] arr){
        Arrays.sort(arr);
        System.out.println("The second largest number is:"+arr[arr.length-2]);

    }
    public static void secondSmallestElement(int[] arr){
        Arrays.sort(arr);
        System.out.println("The second smallest numbers is:"+arr[1]);
    }
    public static void oddAndEvenNumbersInArray(int[] arr){
        System.out.println("The even numbers :");
        for (int num:arr){
            if(num % 2==0){
                System.out.print(num+" ");
            }
        }
        System.out.println(" ");
        System.out.println("The odd numbers");
        for(int num:arr){
            if(num%2!=0){
                System.out.print(num+" ");
            }
        }
    }
    public static void removeSpacesInString(){
        String str="I am shaik Shareef and i'm looking for a job";
        String result=str.replaceAll("\\s","");
        System.out.println("Without space :"+result);
    }
    public static void stringISImmutable(){
        String s1="Hello";
        String s2=s1;
        s1=s1.concat("World");
        System.out.println("S1 is :"+s1);
        System.out.println("s2 is:"+s2);
    //If String were mutable, then changing s1 would also affect s2 since both were pointing to the same object initially.
        //But because String is immutable, concat() creates a new object, and s2 remains unchanged.

    }
    public static void numberOfWordsInString(){
        String str="Hello world";
        String[] words=str.split("\\s+");
        char[] alphabets=str.toCharArray();
        System.out.println("The No of alphabets"+alphabets.length);
        System.out.println("The No of words"+words.length);

    }
    public static void isPalindrome(){
        String str="madam";
        String rev=new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("This is palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }
    public static void reverseString(){
        String str="Shareef";
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println("The reversed string for "+str+" is:"+rev);
    }


}
