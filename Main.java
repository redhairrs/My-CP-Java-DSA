package com.Rishabh;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi, world");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = input.nextInt();
        System.out.println("Enter other number");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("Sum="+sum);
    }
}
