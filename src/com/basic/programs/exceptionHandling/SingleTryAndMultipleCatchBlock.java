package com.basic.programs.exceptionHandling;

public class SingleTryAndMultipleCatchBlock {
    public static void main(String[] args) {
        int[] arr=new int[4];
        try {


            arr[0]=4;
            arr[1]=2;
            arr[2]=8;
            arr[3]=7;
            arr[4]=4;

        } catch (ArithmeticException ae) {
            System.out.println("This is arithmetic exception");
            System.out.println(ae.getMessage());
        }catch(ArrayIndexOutOfBoundsException arrr){
            System.out.println("This is ArrayIndexOutOfBoundsException");
        }
        System.out.println("The Length of the array is : "+arr.length);
        int i=arr.length;
        System.out.println("The i value is :"+i);
        for (int a:arr){
            System.out.print(a+"\t");
        }


    }
}
