package com.Rishabh;
import java.util.Arrays;
public class PassingFuction {
        public static void main(String[] args) {
            int[] nums = {3, 4, 5, 12};
            System.out.println(Arrays.toString(nums));
            change(nums);
            System.out.println(Arrays.toString(nums));
        }
        static void change(int[] arr) {
            arr[0] = 99;
            arr[1] = 33;
            arr[3] = 44;
        }
    }
