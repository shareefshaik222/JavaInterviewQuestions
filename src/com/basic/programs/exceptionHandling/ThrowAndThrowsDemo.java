package com.basic.programs.exceptionHandling;

import javax.xml.transform.stream.StreamSource;

public class ThrowAndThrowsDemo {
    public static void throwAndthrows(int age) throws InterruptedException {

        if(age<18){
            throw new ArithmeticException("You are not eligible to vote  ");
        }else {
            Thread.sleep(2000);
            System.out.println("Your age is :"+ age +" eligible to vote ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        throwAndthrows(6);
    }
}
