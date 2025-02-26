package com.basic.programs;

public class DogClass {
    //non static variables;
    String name;
    String colour;
    String breed;
    int age;

    //non static methods
     void play(){
         System.out.println("playing");
     }
     void sleep(){
         System.out.println("sleeping");
     }
     void eat(){
         System.out.println("eating");
     }

    public static void main(String[] args){
         //calling non static methods/variables under main() with obj reference

        DogClass thorobj=new DogClass();
        thorobj.breed="Husky";
        thorobj.name="Thor";
        thorobj.colour="brown";
        thorobj.age=6;
        System.out.println("Dog name :"+thorobj.name);
        System.out.println("Dog breed :"+thorobj.breed);
        System.out.println("Dog  colour:"+thorobj.colour);
        System.out.println("Dog age :"+thorobj.age);
        thorobj.sleep();
        System.out.println("**********************");

        DogClass captainObj=new DogClass();
        captainObj.age=21;
        captainObj.name="hulk";
        thorobj.play();




    }
    }


