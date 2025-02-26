package com.basic.collectionsPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> studentsGrades = new HashMap<>();
        System.out.println("The map size is :"+studentsGrades.size());
        System.out.println("The Map values are:"+studentsGrades);
        // 1) put()-used to add the elements into the map
        studentsGrades.put("Shareef",100);
        studentsGrades.put("Sharru",90);
        studentsGrades.put("shaik",95);
        System.out.println("The map size is :"+studentsGrades.size());
        System.out.println("The Map values are:"+studentsGrades);
        //2)get()-used to the get the elements
        System.out.println("Shareef score:"+studentsGrades.get("Shareef"));
        //3)remove()-it is used to delete the entry from the map.
        studentsGrades.remove("shaik");
        System.out.println("The map size is :"+studentsGrades.size());
        System.out.println("The Map values are:"+studentsGrades);
        //4)contains(key)--checks whether the given key  exists in the map or not
        System.out.println("is Shareef present in the map : "+studentsGrades.containsKey("Shareef"));
        //5)contains(Value)--check the given value is present or not
        System.out.println("is 100 exist in the map:"+studentsGrades.containsValue(100));
        //6))keySet()-getting all the keys from the map
        Set<String> keyCollection=studentsGrades.keySet();
        System.out.println("All Student names :"+keyCollection);
        //7)entrySet()-getting all the values from the map
        Set<Map.Entry<String,Integer>> allEntries=studentsGrades.entrySet();
        for(Map.Entry<String,Integer> entries:allEntries){
            System.out.println(entries.getKey()+" "+entries.getValue());
        }



    }
}
