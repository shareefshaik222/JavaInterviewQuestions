package com.basic.programs;

import javax.script.ScriptContext;
import java.util.Scanner;

public class DigitsPrograms {
    /*
     1)write a java program to find number of digits in given number
     2)Write a java program to calculate the sum of digits of given number
     */

    //1)write a java program to find number of digits in given number
    public static int noOfDigitsInGivenNumber(long num1){
        int count=0;
        if (num1==0){
            return 1;
        }while (num1!=0){
            num1=num1/10;
            count++;
        }
        return count;
    }


    //Write a java program to calculate the sum of digits of given number
   public static int sumofDigitsInGivenNumber(long num2){
        int sum=0,lastdigit=0;
        if (num2==0){
            return 0;

        }while (num2!=0){
            lastdigit= (int) (num2%10);
            sum=sum+lastdigit;
            num2=num2/10;
       }
        return sum;
   }

    public static void main(String[] args) {
        Scanner scObj=new Scanner(System.in);
        long number=scObj.nextLong();

        int digitCount=noOfDigitsInGivenNumber(number);
        System.out.println("the no of didgits in"+number+" is "+digitCount);

        int sumOfDigits=sumofDigitsInGivenNumber(number);
        System.out.println("the sum of digits in a given number :"+number +" is "+sumOfDigits);
    }

}
