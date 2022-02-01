package com.Rishabh;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        Pad("","12");
        ArrayList<String> ans = PadList("","12");
        System.out.println(ans);
    }

    static void Pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit  = up.charAt(0)-'0';
        for (int i = (digit-1)*3;i<digit*3;i++ ){
            char ch = (char)('a'+i);
            Pad(p+ch, up.substring(1));
        }
    }
    static ArrayList<String> PadList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit  = up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit-1)*3;i<digit*3;i++ ){
            char ch = (char)('a'+i);
            ans.addAll(PadList(p+ch, up.substring(1)));
        }
        return ans;
    }
    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
