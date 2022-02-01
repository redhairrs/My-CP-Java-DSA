package com.Rishabh;

public class RangeXOR {
    public static void main(String[] args) {
        // range xor for a,b = xor(b)^xor(a-1)
        int a =1;
        int b =8;
        int ans = xor(b)^xor(a-1);
        System.out.println(ans);
        // we can u loop but it will give tla for large numbers.
        // a%4 == 3 xor is 0
    }
    static int xor(int a){
        if(a%4 == 0){
            return a;
        }
        if(a%4 == 1){
            return 1;
        }
        if(a%4 == 2){
            return a+1;
        }
            return 0;
    }
}
