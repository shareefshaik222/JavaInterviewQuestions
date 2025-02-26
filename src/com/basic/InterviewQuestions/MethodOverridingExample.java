package com.basic.InterviewQuestions;

public class MethodOverridingExample extends MethodOverloadExample {
    @Override
    public void sound() {
        System.out.println("The Bus horn makes noise");
    }
    @Override
    public double add(double a,double b){
        System.out.println("inside the override method");
        return a+b;

    }

    public static void main(String[] args) {
        //create object for parent class to call only parent class methods
        MethodOverloadExample methLoad = new MethodOverloadExample();
        methLoad.sound();
        methLoad.add(100.0,200.0);
        System.out.println("The sum of two integers :" + methLoad.add(10, 20));


        //create object for child class to call both class methods and override method
        MethodOverridingExample methRide = new MethodOverridingExample();
        methRide.sound();
        System.out.println("The sum of three integers :"+methRide.add(10,20,30));
        //polymorphism
        MethodOverloadExample methload=new MethodOverridingExample();
        methload.sound();
        System.out.println("The sum of two doubles:"+ methload.add(300.0,300.0));




    }
}
