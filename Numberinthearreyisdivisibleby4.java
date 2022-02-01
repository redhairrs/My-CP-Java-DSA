package com.Rishabh;
import java.util.Scanner;
import  java.util.*;

class Numberinthearreyisdivisibleby4 {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);

        // Declare array and user input
        int num = in.nextInt();
        int array[] = new int[num];

        // User input values into array
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int ans = 0;
        // Loop for finding what values are divisible by 4
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 4 == 0) {
                if(array[i] > ans){
                    ans = array[i];
                }
            }

        }
        System.out.println(ans);
    }
}




