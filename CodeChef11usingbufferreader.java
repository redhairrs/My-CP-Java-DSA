package com.Rishabh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeChef11usingbufferreader {
    public static void main(String[] args)  throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T,N,flip,loop;
        int start,end;
        String input,output;
        T = Integer.parseInt(in.readLine());
        while(T-->0){
            String[] a;
            a = in.readLine().split(" ");
            N = Integer.parseInt(a[0]);
            flip = Integer.parseInt(a[1]);
            output="";
            input = in.readLine();
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
