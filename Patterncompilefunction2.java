package com.Rishabh;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Patterncompilefunction2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String z = in.nextLine();
        while(n-->0) {
            String pattern = in.nextLine();
            String regex = "^[aA-zZ]\\w{7,29}$";
                Pattern pattern1 = Pattern.compile(regex);
                Matcher matcher = pattern1.matcher(pattern);
                boolean matches = matcher.matches();
                if(pattern.charAt(0) == '_'){
                    matches = false;
                }
                if(matches) {
                    System.out.println("Valid");
                }else {
                    System.out.println("Invalid");
                }
            }
        }
}
