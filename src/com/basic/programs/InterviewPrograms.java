package com.basic.programs;

public class InterviewPrograms {
    public static int armstrongNumber(int i){
        int originalNum=i,cube=0,rem=0;
        while(i>0){
            rem=i%10;
            i=i/10;
            cube=cube+(rem*rem*rem);
        }
        if(cube==originalNum){
            System.out.println("Given Number "+originalNum+" is a armstrong number :"+cube);
        }else {
            System.out.println("Given number "+originalNum+"is not a armstrog number"+cube);
        }

        return cube;
    }

    public static void fibonacciSeries(int n) {
        int n1 = 1, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;

        }
        System.out.println();
        System.out.println("end of fibonacci series");

    }
    public static void palindromeNumber(int n){
        int rev=0,orininalnumb=n;
        int rem=0;
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        if (orininalnumb==rev){
            System.out.println("Given number "+orininalnumb +" is a palindrome"+rev);
        }else {
            System.out.println("Gievn number "+orininalnumb +" is not a palindrome "+rev);
        }
    }
    public static void armstrongNumberr(int n){
        int orgNumb=n,cube=0,rem=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            cube=cube+(rem*rem*rem);
        } if (orgNumb==cube){
            System.out.println("Given number "+orgNumb +" is a armstrongNumberr"+cube);
        }else {
            System.out.println("Gievn number "+orgNumb +" is not a armstrongNumberr  "+cube);
        }

    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }


        }
        return true;
    }
    public static void printPrimeNumbers(int n){
        for (int i=1;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
    public static void triangleShape(int n){
        String name="sha";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  "+name);

            }
            System.out.println();
        }
    }
    private static void pyramidShape(int rows){
        int columnCount=1;
        for(int i=rows;i>=1;i--){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=columnCount;k++){
                System.out.print(" * ");
            }
            System.out.println();
            columnCount++;
        }
    }
    public static void main(String[] args) {
        int var1=armstrongNumber(155);
        System.out.println(var1);
        fibonacciSeries(12);
        palindromeNumber(122);
        armstrongNumberr(155);
        boolean var2=isPrime(34);
        System.out.println("The given number 34 is a prime number : "+var2);
        printPrimeNumbers(20);
        triangleShape(4);
        pyramidShape(5);
    }

    }

