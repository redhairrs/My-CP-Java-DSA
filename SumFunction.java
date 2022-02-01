package com.Rishabh;

import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
//    String message = string();
//        System.out.println(message);
//        int ans = Sum3(20,30);
//        System.out.println(ans);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String naam = in.nextLine();
        String person = string1(naam);
        System.out.println(person);
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
    // Hello world funtion
    static void greeting(){
        System.out.println("Hello world");
    }
    // String type example
    static String string(){
        String ans = "Hi their, I am red hair";
        return ans;
    }
    //String parameter
    static  String string1(String naam){
        String make = "Hello " + naam;
        return make;
    }
    //Giving parameters
    static int Sum3(int a, int b){
        int sum1 = a+b;
        return sum1;
    }
}



