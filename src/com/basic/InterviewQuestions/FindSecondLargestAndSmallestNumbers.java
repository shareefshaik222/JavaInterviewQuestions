package com.basic.InterviewQuestions;

public class FindSecondLargestAndSmallestNumbers {

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9};
        int secondSmallestNum=findSecondSmallest(numbers);
        int secondLargestNum=findSecondLargest(numbers);
        int  thirdLargestNum=findThirdLargest(numbers);
        System.out.println("The second largest num in:"+numbers+" is :"+secondLargestNum);
        System.out.println("The second smallest num in:"+numbers+" is :"+secondSmallestNum);
        System.out.println("The Third largest num in:"+numbers+" is :"+thirdLargestNum);

    }
    public static int findSecondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                //updating second largest
                secondLargest=largest;
                //updating largest
                largest=num;
            }else if(num>secondLargest&&num !=largest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }
    public static int findSecondSmallest(int[] arr){
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<smallest){
                //updating second largest
                secondsmallest=smallest;
                //updating largest
                smallest=num;
            }else if(num<secondsmallest&&num !=smallest){
                secondsmallest=num;
            }
        }
        return secondsmallest;
    }
    public static int findThirdLargest(int[] arr){
        //sort only the first three elements
        for(int i=0; i<3 ; i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    //swap elements if they are in the wrong order
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }return arr[2];
    }

}
