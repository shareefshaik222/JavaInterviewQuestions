package com.basic.programs.exceptionHandling;

public class NumberFormatException {
    public static void main(String[] args) {

        String s1= null;
        try {
            String s="Shareef";
            String s4=s.concat("Sk");
            int i=Integer.parseInt(s);//converting string into integer type //unboxing..converting primitive to obj -Autoboxing
            //syntax : int var =Integer.parseInt(String obj);
            s1 = s+"Shaik";
            String s2=s1+i;
            System.out.println("s2 value is :"+s2);
        } catch (RuntimeException e) {
            System.out.println("This is a NumberFormat Exception");
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
        System.out.println("The s1 value is :"+s1);



    }
}
