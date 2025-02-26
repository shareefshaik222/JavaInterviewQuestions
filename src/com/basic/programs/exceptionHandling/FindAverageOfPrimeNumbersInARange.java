package com.basic.programs.exceptionHandling;

public class FindAverageOfPrimeNumbersInARange {
    public static void main(String[] args) {
        int start=10;
        int end=50;
        int sum=0;
        int count=0;
        System.out.println("The Prime numbers are :");
        for (int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                sum+=i;
                count++;
            }
        }
        System.out.println("");

        if(count>0){
            double average=(double)sum/count;
            System.out.println("The average of Prime numbers :"+average);
        }

    }


    public static boolean isPrime(int n) {
        if(n<=1){
            return false;

        }for (int i=2;i<=Math.sqrt(n);i++){
            if (n%2==0){
                return false;
            }

        }
        return true;
    }

}

