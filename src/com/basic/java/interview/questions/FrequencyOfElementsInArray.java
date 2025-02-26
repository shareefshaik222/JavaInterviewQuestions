package com.basic.java.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsInArray {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,4,5,6,3,2,1};
        //using hashmap to store the frequency of each element
        HashMap<Integer,Integer> freqMap=new HashMap<>();

        for(int num:arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        //Displaying the frequency of each element
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            System.out.println(entry.getKey()+"occurs"+entry.getValue()+"times");
        }

    }
}
