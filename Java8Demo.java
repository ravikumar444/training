package com.example.demo;
public class Java8Demo implements MyInterface,MySecondInterface {

 

    public static void main(String[] args) {
        Java8Demo inter = new Java8Demo();
        inter.newMethod();
    }

 

    
    public void newMethod() {
        MySecondInterface.super.newMethod();
    }
}

 

interface MyInterface {

 

    default void newMethod() {
        System.out.println("MyInterface");
    }

 

}

 

interface MySecondInterface {

 

    default void newMethod() {
        System.out.println("MySecondInterface");
    }

 

}

 