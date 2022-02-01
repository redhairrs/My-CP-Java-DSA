package com.Rishabh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class splitfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.trim();
        if(s.length() == 0 ){
            System.out.println(0);
        }else{
            String[] wordArray = s.split("[\\s,?'!_.@]+");

            ArrayList<String> wordList = new ArrayList<>();
            for(int i=0;i<wordArray.length;i++) {
                wordList.add(wordArray[i]);
            }
            System.out.println(wordArray.length);
            for(int i=0;i<wordArray.length;i++){
                System.out.println(wordList.get(i));
            }
        }
    }
}
