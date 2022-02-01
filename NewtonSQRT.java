package com.Rishabh;

public class NewtonSQRT {
    public static void main(String[] args) {
    System.out.println(sqrt(40));
    }

    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = (x + (n / x))/2;

            if (Math.abs(root - x) < 0.01) {
                break;
            }
            x = root;
        }
        return root;
    }
}