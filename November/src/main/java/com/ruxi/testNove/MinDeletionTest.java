package com.ruxi.testNove;

public class MinDeletionTest {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,3};
        int n= nums.length;
        int result=0;
        for (int i=0;i<n;i++){
            if ((i+result)%2==0&&i+1<n&&nums[i]==nums[i+1]){
                result++;
            }
        }
        result = (n-result)%2!=0 ? result+1:result;
        System.out.println(result);
    }
}
