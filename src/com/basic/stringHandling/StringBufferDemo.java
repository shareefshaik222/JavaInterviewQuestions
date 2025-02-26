package com.basic.stringHandling;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Shareef");
        System.out.println("The sb value is :"+sb);
        sb.append("shaik");
        System.out.println("sb value after append is:"+sb);
        sb.insert(7," ");
        System.out.println("sb value after insert is :"+sb);
        sb.replace(8,13,"Sharru");
        System.out.println("sb value after replace is:"+sb);
        sb.delete(7,14);
        System.out.println("sb value after delete() is:"+sb);
    }
}
