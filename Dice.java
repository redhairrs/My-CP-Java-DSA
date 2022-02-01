package com.Rishabh;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        ArrayList<String> ans = diceList("",3);
//        System.out.println(ans);
        ArrayList<String> ans = diceListFace("",4,7);
        System.out.println(ans);
    }
    static  void dice(String p,int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target;i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> diceList(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target;i++){
            ans.addAll(diceList(p+i,target-i));
        }
        return ans;
    }
    static ArrayList<String> diceListFace(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= face && i <= target;i++){
            ans.addAll(diceListFace(p+i,target-i , face));
        }
        return ans;
    }

}
