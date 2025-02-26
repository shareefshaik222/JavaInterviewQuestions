package com.basic.programs;

import java.util.Scanner;

public class ControlStructuresPrograms {

    public static int getSum(int n){
        int i=1,sum=0;
        while (i<n){
            sum=sum+i;
            i++;
        }
        return sum;

    }
    public static int getFactorial(int n){
        int i=1,fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        return fact;
    }
private static int GetDifference(int n){
        int evenSum=0,oddSum=0,difference=0;
        int i=1;
        while (i<n){
            if (i%2==0){
                evenSum=evenSum+i;
            }else {
                oddSum=oddSum+i;
            }
            i++;
        }
        difference=evenSum-oddSum;
    System.out.println("the evensum is :"+evenSum);
    System.out.println("the oddsum is :"+oddSum);
    System.out.println("the difference is :"+difference);
        return difference;
}
public static void choiceDemo(){
        int number,sum=0;
        char choice =0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the number :");
            number=sc.nextInt();
            sum=sum+number;
            System.out.println("Enter the choice yes or no :");
            choice=sc.next().charAt(0);

        }while (choice=='y'||choice=='Y');
    System.out.println("The sum of the entered numbers is :"+sum);


}
public static int getMax(int[] num){
        int max=num[0];
        for(int i=0;i<=num.length;i++){
            if (num[i]>max){
                max=num[i];
            }

        }
        return max;
}
public static int[] getrandomArray(){

        final int SIZE=6;
        int[] randArray=new int[SIZE];
        for(int i=0;i<=SIZE;i++){
            randArray[i]= (int) (Math.random()*100);
        }
        return randArray;
}


    public static void main(String[] args) {
        int var1=getSum(20);
        System.out.println("The sum of the 20 natural numbers is :"+var1);

        System.out.println("The difference is :"+GetDifference(60));
        System.out.println("The factorial value is :"+getFactorial(3));
        choiceDemo();
    }
}
