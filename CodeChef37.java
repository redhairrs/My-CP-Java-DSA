package com.Rishabh;

import java.util.Scanner;

public class CodeChef37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            if(n%2 !=0){
                System.out.println("Yes");
                for(int i=1;i<=n/2;i++) {
                    System.out.print(i+" ");
                }
                for(int i=n;i>n/2;i--) {
                    System.out.print(i+" ");
                }
            }else if(n==2){
                System.out.println("No");
            }else{
                System.out.println("Yes");
                System.out.print(n/2+" ");
                for(int i=1;i<n/2;i++){
                    System.out.print(i+" ");
                }
                for(int i=n;i>n/2;i--){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
