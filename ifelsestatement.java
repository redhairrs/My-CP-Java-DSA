package com.Rishabh;

public class ifelsestatement {
    public static void main(String[] args) {
        int sal = 15000;
        if (sal==20000){
            System.out.println("Poor");
            sal = sal + 100000;
        }
        else if (sal>10000) {
            System.out.println("Fucking middle class");
        }
        else {
            System.out.println("Rich enough");
        }
        System.out.println(sal);
    }
}
