package com.Rishabh;
import java.util.Scanner;
public class SwitchStatement {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
       String fruit = in.next();
//
            switch (fruit) {
                case "Mango":
                    System.out.println("King of fruits");
                    break;
                case "Apple":
                    System.out.println("A sweet red fruit");
                    break;
                case "Orange":
                    System.out.println("Round fruit");
                    break;
                case "Grapes":
                    System.out.println("Small fruit");
                    break;
                default:
                    System.out.println("please enter a valid fruit");
                    break;
            }

            int day = in.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

//            switch (day) {
//                case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//                case 6, 7 -> System.out.println("Weekend");
//            }


        }
    }
