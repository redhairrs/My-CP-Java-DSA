package com.Rishabh;

import java.util.Scanner;
public class CodeChef11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T,N,flip,loop;
        int start,end;
        String input,output;
        T = in.nextInt();
        while(T-->0){
            N = in.nextInt();
            flip = in.nextInt();
            output="";
            String a = in.nextLine();
            input = in.nextLine();
            if(flip%2==0){
                start=flip/2;
                loop=start;
                end=start+1;

            }
            else{
                start=flip/2;
                end=start+2;
                output+=input.charAt(start);
                loop=start;

            }

            while(loop-->0){
                output+=input.charAt(end-1);
                output+=input.charAt(start-1);
                end++;
                start--;}

            for(int i=flip;i<N;i++){
                output+=input.charAt(i);
            }
            System.out.println(output);
        }
    }
}
