package com.basic.InterviewQuestions;

public class CharacterCount {
    public static void main(String[] args) {
        String input="aabbbrrreedd";
        String compressive=compressive(input);
        System.out.println("Compressed string :"+compressive);
    }

    public static String compressive(String str){
        StringBuilder sb= new StringBuilder();
        int count=1;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
            }else {
                //append the character and its count
                sb.append(str.charAt(i)).append(count);
                count=1;//reset count=1 for next character
            }

        }
        return sb.toString();
    }
}
