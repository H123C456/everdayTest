package com.ruxi.testNove;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};

        HashSet<Integer> unique = new HashSet<>();
        for (int num : nums){
            unique.add(num);
        }
        int len = unique.size();
        int p=0;
        for (int num : unique){
                nums[p++] = num;
        }
        int[] ints = Arrays.copyOf(nums, len);
        System.out.println(len);
        Arrays.stream(ints).forEach(s-> System.out.println(s));



        //这是用的本方法
        /*
        int[] removeNums = new int[nums.length];

        int w = 0;
        int Length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i==0||nums[i] != nums[i-1]){
                removeNums[w] = nums[i];
                Length++;
                w++;
            }else if (nums[i] == nums[i - 1]) {
                continue;
            }
        }
        System.arraycopy(removeNums,0,nums,0,removeNums.length);
        System.out.println("数组的长度:"+Length);

        Arrays.stream(removeNums).forEach(p-> System.out.println(p));*/
    }
}