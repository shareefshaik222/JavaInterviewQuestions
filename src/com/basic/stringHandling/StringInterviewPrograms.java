package com.basic.stringHandling;

public class StringInterviewPrograms {
    /**
     * write a program to reverse a given string
     */
    public static String reverseString(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public static String reverseString2(String s){
        String rev="";
        for(int i=0;i<=s.length()-1;i++){
            rev=s.charAt(i)+rev;
        }
        return rev;
    }
/**
*write a program to check the given string is palindrome or not
 *
 */
private static boolean isPalindrome(String s){
    System.out.println("original string value is :"+s);
    boolean ispalindrome=true;
    for(int i=0;i<s.length()/2;i++){
        if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            ispalindrome=false;
            break;
        }
    }return true;
}
//write a program to count the number of vowels,consonants,numbers ,special characters
    public static void countVowelsConsonantsNumbers(String s){
    int vCount=0;int cCount=0,nCount=0,splCOunt=0;
    s=s.toLowerCase();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vCount++;
        } else if (ch>='a'&&ch<='z') {
            cCount++;
        } else if (ch>='0'&&ch<='9') {
            nCount++;
        }else{
            splCOunt++;
        }
    }
    System.out.println("vowels count is:"+vCount);
        System.out.println("consonants count is :"+cCount);
        System.out.println("numbers count is:"+nCount);
        System.out.println("special characters count is:"+splCOunt);
    }
    public static void swappingTwoStrings(String s1,String s2){
        System.out.println("Before Swapping s1 :"+s1+" s2: "+s2);
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("After swapping s1:"+s1+" s2 :"+s2);
    }

    public static void main(String[] args) {
        String var1=reverseString("shareef");
        System.out.println("The reversed String is:"+var1);
        String var2=reverseString2("shaik");
        System.out.println("The reversed string value is:"+var2);
        boolean b=isPalindrome("racecar");
        System.out.println("The given string is palindrome :"+b);
        countVowelsConsonantsNumbers("dfwaeioudfwyfr264595@$");
        swappingTwoStrings("Good","evening");

    }

}
