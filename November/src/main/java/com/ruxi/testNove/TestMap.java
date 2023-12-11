package com.ruxi.testNove;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        System.out.println(hashSet);
        int i =0;
        for (Integer j:hashSet){
            i=i+j;
        }
        System.out.println(i);
    }
}
