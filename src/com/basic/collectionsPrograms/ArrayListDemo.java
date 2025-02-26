package com.basic.collectionsPrograms;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //interface objref=new Implemented class();
        List al=new ArrayList();
        System.out.println("al collection size :"+al.size());
        System.out.println("al collection elements :"+al);
        al.add("java");
        System.out.println("al collection elements :"+al);
        al.add(0,"python");
        System.out.println("al collection elements :"+al);
        al.addAll(Arrays.asList("C++",45,7,'s',"Shareef","Shaik"));
        System.out.println("al collection size :"+al.size());
        System.out.println("al collection elements :"+al);
        //remove()
        al.remove("java");
        System.out.println("al collection size after remove():"+al.size());
        System.out.println("al collection elements after remove() :"+al);
        //isEmpty()
        boolean b=al.isEmpty();
        System.out.println("checking whether the collection empty :"+b);
        //contains()
        boolean b1=al.contains("Shareef");
        System.out.println("Checking whether the elemnt is present :"+b1);
        //removeAll()
        al.removeAll(Arrays.asList(45,'s'));
        System.out.println("al collection size after remove():"+al.size());
        System.out.println("al collection elements after remove() :"+al);
        //sort

        //addAll()
        al.addAll(Arrays.asList(1,"Java","python","Shaik",45));
        System.out.println("al collection size :"+al.size());
        System.out.println("al collection elements after add() :"+al);
        //iterator()
        Iterator it= al.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"\t");
        }
        System.out.println();
        System.out.println("iterate using for each loop");
        for(Object a:al){
            System.out.print(a+"\t");
        }
        System.out.println();
        System.out.println("iterate using normal for loop");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+"\t");
        }
        System.out.println();
        al.forEach(System.out::println);
        //retainAll
        al.retainAll(Arrays.asList("Shareef","Shaik"));
        System.out.println("The al collection size retainAll():"+al.size());
        System.out.println("The al collection is :"+al);



    }
}
