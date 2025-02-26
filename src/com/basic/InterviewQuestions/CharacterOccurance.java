package com.basic.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {
    public static void main(String[] args) {
        String str="vikatakavi";
        char[] chars=str.toCharArray();
        HashMap<Character,Integer>charCount=new HashMap<>();
        for (char ch:chars){
            if(charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch)+1);
            }else {
                charCount.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> entry:charCount.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
