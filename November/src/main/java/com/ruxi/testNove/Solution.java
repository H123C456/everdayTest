package com.ruxi.testNove;

public class Solution {

    public static void main(String[] args) {
        int[] nums={3};
        int threshold = 3;

        int i ;
        if (nums.length==1){
            System.out.println(1);
        }else {
            i = threshold % nums.length;
            System.out.println(threshold - i - 1);
        }


    }
}
