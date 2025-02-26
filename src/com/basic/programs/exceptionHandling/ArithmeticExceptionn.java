package com.basic.programs.exceptionHandling;

import javax.lang.model.element.ModuleElement;

public class ArithmeticExceptionn{
    public static void divison(){
        int c= 0;
        try {
            int a=2;
            int b=0;
            c = a/b;//if we divide any value is divided by 0 , will get arithmetic exception
        } catch (ArithmeticException ae) {
            System.out.println("This is a arithmetic exception ");
            System.out.println("This is a catch block");

        }finally {
            System.out.println("This is a finally block.This block will be executed whether exception handled or not");
        }
        System.out.println("the c value is :"+c);
        System.out.println("*******");


    }

    public static void main(String[] args) {
       divison();
    }
}
