package com.ruxi.testNove;


import java.util.ArrayList;
import java.util.List;

public class FindTheLongestBalancedSubstring {

    public static void main(String[] args) {
        String s = "01000111";
        String[] split = s.split("");
        int left;
        int right;
        int num=0;
        List<Integer> result = new ArrayList<>();

        String lNum;
        String rNum;
        for (int i=1;i<split.length;i++){
            left=i-1;
            right=i;
            lNum = split[left];
            rNum = split[right];
            if (lNum.equals(rNum)){
                num++;
                left--;
                right++;
                if (left==0||right>= split.length){
                    result.add(num);
                    break;
                }
            }
        }
        System.out.println(num);

    }
}
