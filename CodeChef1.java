package com.Rishabh;

import java.util.Scanner;

public class CodeChef1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int d;
        int c;
        if(a.equals("R")){
            c=3;
        }else if(a.equals("B")){
            c =2;
        }else{
            c =1;
        }
        if(b.equals("R")){
            d=3;
        }else if(b.equals("B")){
            d =2;
        }else{
            d =1;
        }
        if(c>d){
            if(c == 3){
                System.out.println("R");
            }else if(c == 2){
                System.out.println("B");
            }else {
                System.out.println("G");
            }
        }else if(d>c){
            if(d == 3){
                System.out.println("R");
            }else if(d == 2){
                System.out.println("B");
            }else {
                System.out.println("G");
            }
        }else{
            if(c == 3){
                System.out.println("R");
            }else if(c == 2){
                System.out.println("B");
            }else {
                System.out.println("G");
            }
        }
    }

}
