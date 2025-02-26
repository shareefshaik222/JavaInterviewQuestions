package com.basic.programs.exceptionHandling;

import java.net.StandardSocketOptions;

public class NullPointerException  {
    //if you have a null value in a variable , and you are trying to do operations on it ,will get Nullpointer exception
    public static void main(String[] args)  {

        try {
            String s="Shareef";
            System.out.println("The String lenth is :"+s.length());
            char c=s.charAt(0);
            System.out.println("The c value is :"+c);
        } catch (RuntimeException e) {
            System.out.println("This is  catch block");
        } finally {
            System.out.println("This is finally block");
        }
        System.out.println("*****************");
    }


}
