package com.basic.stringHandling;

import java.util.Date;

public class StringMethodsDemop {
    static String s="Shareef";

    public static void main(String[] args) {
        //length method is used to find the length
        System.out.println("The length of "+s+" is "+s.length());
        //charAt(index):it fetches the char at the given index and returns char
        char c=s.charAt(2);
        System.out.println("The char at the end position is:"+c);
        //toCharArray[] : it converts the given string into charArray[]
        char[] arr=s.toCharArray();
        System.out.println("printing char[]...");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for(char ch:arr){
            System.out.print(ch+"\t");
        }
        System.out.println();
        //toUpperCase():It converts the lowerCAse letters to upperCase.
        String s1=s.toUpperCase();
        System.out.println("s1 value is :"+s1);
        String s2=s.toLowerCase();
        System.out.println("s2 value is :"+s2);
        //toLowerCase(): it converts the uppercase letters to lowerCase.
        //isEmpty():it checks whether the given String is empty or not.
        boolean b=s.isEmpty();
        System.out.println(s+" is empty :"+b);
        String s3=s.concat("Shaik");
        System.out.println("THe s3 value is :"+s3);
        //contains():it checks whether the given string is present in th main string or not .and returns boolean
        boolean b2=s3.contains(s);
        System.out.println(s3+"contains the string :"+s+"::"+b2);
        //startsWith(prefix):it checks whether prefix string is same or not
        boolean b3=s3.startsWith("Shareef");
        System.out.println(s3+" String starts with prefix string shareef :"+b3);
        //endWith(suffix);
        boolean b4=s3.startsWith(s2);
        System.out.println(s3+" Starts with "+s2+":"+b4);
        boolean b5=s3.endsWith("Shaik");
        System.out.println(s3+" ends with Shaik :"+b5);
        //compares two string contents and return boolean value
        boolean b6=s1.equals(s2);
        System.out.println("THe b6 value is :"+b6);
        //equalsIgnoreCase():compares two strings and the ignores the camel cases
        boolean b7=s1.equalsIgnoreCase(s2);
        System.out.println("The b7 value is :"+b7);
        String s5=" Shaik shareef ";
        //trim():it trims the spaces at the head and tail portions
        String s6=s5.trim();
        System.out.println(s5+" after trim() :"+s6);

        String s7=" ";
        boolean b8=s7.isEmpty();
        System.out.println("checking whether s7 is empty or not  :"+b8);
        boolean b9=s7.isBlank();
        System.out.println("b9 value is :"+b9);
        //split():its splits the string based on the given delimeter
        String s8="I am learning java selenium ";
        String[] words=s8.split("\\s");
        String s10=words[3];
        System.out.println("the s10 value is :"+s10);
        //replace(oldChar/oldString,newChar/newString);
        String s12="Shareef";
        String s13=s12.replace('S','f');
        System.out.println("the s13 value is:"+s13);
        String s11=s8.replaceAll("java","python");
        System.out.println("the s11 value is :"+s11);
        //indexOf(char/String):frtches the given char/String index..it returns int
        int indexVal=s3.indexOf("Shaik");
        System.out.println("the indexVal is:"+indexVal);
        //lastIndexOf(char/String):it fetches the last index of the given char/string
        int lindex=s3.lastIndexOf('a');
        System.out.println("the last index  value of a char is:"+lindex);

        byte[] btarray=s.getBytes();
        for (byte bt:btarray) {
            System.out.println(bt);
        }
            /**
             * SubString(int index):it fetches all the chars from index to till end
             * subString(int StartIndex,int endIndex):it fetches all the chars from start index to end index
             * Start index is inclusive and end index is exclusive
             * returns String
             *
             */
            String s14=s3.substring(7);
            System.out.println("subString in s3 is"+s14);
            String s15=s3.substring(0,7);
            System.out.println("subString sahreef in s3 is:"+s15);
            /**
             * compareTo():compares to strings lexicoGraphically
             * if s1>s2=+value
             * if s1<s2=-value;
             * if  s1==s2=0;
             */
            System.out.println(s1 +" is compared to "+s2+"using compareTo :"+s1.compareTo(s2));
            System.out.println(s2 +" is compared to "+s1+"using compareTo :"+s2.compareTo(s1));
        /**
         * how to find the length of the string without using length()
         *
         */
        System.out.println("The length of "+s1 +"is"+s1.compareTo(""));
        /**
         * repeat(int number):it repeats the string with given number of times
         *
         */
        String s16=s.repeat(3);
        System.out.println(s+" value is repeated by using repeat() "+s16);
        /**
         * join(delimiter,s1,s2,s3):it joins all the strings with the given delimeter
         *returns String
         */
        Date d =new Date();
        System.out.println("d value is :"+d);

        String s17=String.join("-","Aug","21","14:57:03");
        System.out.println("s17 value is :"+s17);
        /**
         * toString():it converts the object into string format
         * return string
         *
         */
        String s18=d.toString();
        System.out.println("the s18 value is :"+s18);
        /**
         * valueof():it converts the given value into string
         *
         */
        String val=String.valueOf(25);
        String s19=val.concat("32");
        System.out.println("the value of s19 is:"+s19);



    }
}



