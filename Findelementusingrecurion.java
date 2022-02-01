package com.Rishabh;
import java.util.Scanner;

public class Findelementusingrecurion {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(arrey(arr, 0));
    }
    static boolean arrey(int arr[], int index){
        // base condition
        if(index == arr.length-1){
            return true;
        }
        return  arr[index] < arr[index + 1] && arrey(arr, index + 1);
    }
}
