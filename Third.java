package com.Rishabh;
import java.util.Scanner;
public class Third {
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.println("Enter the Temp celsius");
            float tempC = in.nextFloat();
            float tempF = (tempC*9/5)+32;
            System.out.println(tempF);
        }
}

