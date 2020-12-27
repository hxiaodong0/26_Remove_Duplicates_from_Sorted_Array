package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int removeDuplicates(int[] nums) {
        //return 0 for invalid inputs
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        //Two pointers.
        for (int j = 1; j < nums.length; j++){
            // only move the left pointer when the left point value and right pointer values does not match
            if (nums[i] != nums[j]){
                i++;
            }

            nums[i] = nums[j];
        }

        return i+1; // i+1 for the length


    }

    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,1,2));
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        int[] test = {1,1,2,2,2,2,2,3,4,4,5};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(test));
        int TF = removeDuplicates(test);
        System.out.println(Arrays.toString(test));
        System.out.println(TF);
    }
}
