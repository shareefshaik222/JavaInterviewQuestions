package com.basic.collectionsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringProgramsUsingMap {
    /**
     * Finding the occurrence of a character in a string
     */
    public static  Map<Character,Integer> findOccurrenceOfaCharacter(String s){
        //create a map
        Map<Character,Integer> occurrence=new HashMap<>();
        //convert it into charArray
        char[] c=s.toCharArray();
        //iterate the array
        for(char ch:c){
            if(occurrence.containsKey(ch)){
                occurrence.put(ch,occurrence.get(ch)+1);
            }else {
                occurrence.put(ch,1);
            }

        }
        return occurrence;

    }

    /**
     * occurrence of a word in a sentence
     *
     */
    public static void occurrenceOfaWord(String s) {
        Map<String, Integer> occurrence = new HashMap<>();
        String[] words = s.split("\\s+"); // Split by one or more whitespace characters

        for (String word : words) {
            word = word.toLowerCase(); // Normalize to lowercase to make the count case-insensitive

            if (occurrence.containsKey(word)) {
                occurrence.put(word, occurrence.get(word) + 1);
            } else {
                occurrence.put(word, 1);
            }
        }

        System.out.println(occurrence);
    }

    /**
     * find the duplicate characters in the given string
     *
     */
    public static void duplicateCharacters(String s){
       Map<Character,Integer> duplicateMap=findOccurrenceOfaCharacter(s);
       //collecting all the keys from the map using keySet()
        Set<Character> keyscol=duplicateMap.keySet();
        for (char key:keyscol){
            if(duplicateMap.get(key)>1){
                System.out.println(key);
            }
        }

        System.out.println("*********");
    }
    public static void printFirstNotRepeatedcharcter(String s){
        Map<Character,Integer> duplicateMap=findOccurrenceOfaCharacter(s);
        //collecting all the keys from the map using keySet()
        Set<Character> keyscol=duplicateMap.keySet();
        for (char key:keyscol){
            if(duplicateMap.get(key)==1){
                System.out.println(key);
                break;
            }
        }
        System.out.println("*********");
    }
    private static void findMaxRepeatedCharCount(String s){
        Map<Character,Integer> maxCountMap=findOccurrenceOfaCharacter(s);
        int maxCOunt=0;
        char maxChar=' ';
        //fetch all the entries from the map using entrySet()
        Set<Map.Entry<Character,Integer>>entriesCol=maxCountMap.entrySet();
        for(Map.Entry<Character,Integer> ent:entriesCol){
            if (ent.getValue()>maxCOunt){
                maxCOunt=ent.getValue();
                maxChar= ent.getKey();
            }
        }
        System.out.println("Max char "+ maxChar +" Max count : "+maxCOunt);


    }
    public static void main(String[] args) {
        findOccurrenceOfaCharacter("shareefShaiksasas");
        occurrenceOfaWord("Shareef java Shareef java java java Shareef");
        duplicateCharacters("vdhavvvsfsdfsga");
        printFirstNotRepeatedcharcter("radar");
        findMaxRepeatedCharCount("shareefshaikshareeffshaikkkkk");
    }

}
