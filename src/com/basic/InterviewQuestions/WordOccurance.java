package com.basic.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class WordOccurance {
    public static void main(String[] args) {


        String str = "I am java developer and I am proud of it ";
        String[] words=str.split("\\s+");
        HashMap<String,Integer> wordsCount=new HashMap<>();
        for (String word:words){
            //check if the map has the value or not
            if(wordsCount.containsKey(word)){
                wordsCount.put(word,wordsCount.get(word)+1);
            }else {
                wordsCount.put(word,1);
            }
        }
        for (Map.Entry<String,Integer> entry:wordsCount.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    }
