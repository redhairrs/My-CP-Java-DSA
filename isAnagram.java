package com.Rishabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class isAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean ret = false;
        if (a.length() < 50 && b.length() < 50) {
             ret = false;

            ArrayList<Character> list = new ArrayList<>();
            ArrayList<Character> list1 = new ArrayList<>();
            String aa = a.toLowerCase();
            String bb = b.toLowerCase();
            for (int i = 0; i < a.length(); i++) {
                list.add(aa.charAt(i));
            }
            for (int i = 0; i < b.length(); i++) {
                list1.add(bb.charAt(i));
            }
            Collections.sort(list);
            Collections.sort(list1);
            if (list.equals(list1) == true) {
                return ret = true;
            }

        }
        return ret;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
