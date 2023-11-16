package com.ruxi.testNove;

public class longestAlternatingSubarray {

    public static void main(String[] args) {

        int[] nums = {3,2,5,4};
        int threshold = 5;
        int[] result = new int[nums.length];


        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                for (int j=i;j< nums.length;i++){
                    if (nums[i]%2!=nums[i+1]%2){

                    }
                }
            }
        }


    }
}
