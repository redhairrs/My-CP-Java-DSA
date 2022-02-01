package com.Rishabh;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = prod(12345);
        System.out.println(ans);
    }
    
    static int prod(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10) * prod(n/10);
    }
}