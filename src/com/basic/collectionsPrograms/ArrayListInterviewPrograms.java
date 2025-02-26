package com.basic.collectionsPrograms;

import java.util.*;

public class ArrayListInterviewPrograms {
    public void arrangeEvenfirstAndThenOdd(int[] num){
        //create ArrayList object
        List<Integer> evenList=new ArrayList<>();
        List<Integer> oddList=new ArrayList<>();
        //check the given the array is even or not
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                evenList.add(num[i]);
            }
            else {
                oddList.add(num[i]);
            }

        }
        //combine the two arrays using addAll()
        evenList.addAll(oddList);
        System.out.println("The arranged list after combined both arrays :"+evenList);

    }
    private void reverseTheArrayInPlace(){
        List<String> listOfFoods=new ArrayList<>();
        listOfFoods.addAll(Arrays.asList("Biryani","coke","Dessert","Veg Biryani","soup","Choclates","Beans"));
        System.out.println("original arraylist :"+listOfFoods);
        //iterator
        for(int i=0;i<listOfFoods.size()/2;i++){
            final String foodItems=listOfFoods.get(i);
            listOfFoods.set(i,listOfFoods.get(listOfFoods.size()-i-1));
            listOfFoods.set((listOfFoods.size()-i-1),foodItems);
        }
        System.out.println("Array list after reversing :"+listOfFoods);
    }

    /**
     * write a program to union two inerger arrays
     * @param num1 , num2
     */
    public void unionTwoIntergers(int[] num1,int[] num2){
        //create set collection
        Set<Integer> hs=new HashSet<>();
        //add num1 array elemets to the colletion
        for(int i=0;i<num1.length;i++){
            hs.add(num1[i]);
        }
        //add num2 array elemnts into the collection
        for(int j=0;j< num2.length;j++){
            hs.add(num2[j]);
        }
        System.out.println("The collection after union two arrays :"+hs);

    }
    protected void intersetionOfTwoArraysElements(int[] num1,int[] num2){
        System.out.println("array1 elements:"+Arrays.toString(num1));
        System.out.println("array2 elements:"+Arrays.toString(num2));
        //create set collection
        Set<Integer> intersection=new HashSet<>();
        //add array1 elements to the collections
        for(int i=0;i<num1.length;i++){
            intersection.add(num1[i]);
        }
        //add the second array and each element to the collection
        for(int j=0;j<num2.length;j++){
           if( intersection.contains(num2[j])){
               System.out.println(num2[j]);
           }
        }
    }
    //print duplicate elements in the given array
    void printDupliacteElemnts(int[] num){
        System.out.println("The array element:"+Arrays.toString(num));
        //create the set collection
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<num.length;i++){
            if(hs.add(num[i])==false){
                System.out.print(num[i]+"\t");

            }
        }
    }
    public void findingDuplicateElements(){
        List<String> listOfFoods=new ArrayList<>();
        listOfFoods.addAll(Arrays.asList("Biryani","Biryani","coke","coke","Dessert","Veg Biryani","soup","Choclates","Beans"));
        System.out.println("original arraylist :"+listOfFoods);
        for(int i=0;i<listOfFoods.size();i++){

        }
    }
    public static void main(String[] args) {
        int[] num={1,3,4,7,8,9,3,5,6,4,2};
        ArrayListInterviewPrograms arr1=new ArrayListInterviewPrograms();
        arr1.arrangeEvenfirstAndThenOdd(num);
        arr1.reverseTheArrayInPlace();
        int[] num1={8,9,4,5,8,1,2};
        int[] num2={8,4,5,2,3,2};
        arr1.unionTwoIntergers(num1,num2);
        arr1.intersetionOfTwoArraysElements(num1,num2);
        arr1.printDupliacteElemnts(num2);
    }
}
