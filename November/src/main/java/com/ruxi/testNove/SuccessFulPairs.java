package com.ruxi.testNove;


import java.util.Arrays;

//给你两个正整数数组 spells 和 potions ，长度分别为 n 和 m ，其中 spells[i] 表示第 i 个咒语的能量强度，potions[j] 表示第 j 瓶药水的能量强度。
//
//        同时给你一个整数 success 。一个咒语和药水的能量强度 相乘 如果 大于等于 success ，那么它们视为一对 成功 的组合。
//
//        请你返回一个长度为 n 的整数数组 pairs，其中 pairs[i] 是能跟第 i 个咒语成功组合的 药水 数目。
public class SuccessFulPairs {

    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        int success = 7;
        int length = potions.length-1;
        int result;
        for (int i=0;i<spells.length;i++){
            result=0;
            for (int j=0;j<potions.length;j++){
                if (spells[i]*potions[j]>=success){
                    System.out.println(spells[i]+"*"+potions[j]+"="+spells[i]*potions[j]);
                    result++;
                }
                if (j==length){
                    System.out.println(spells[i]+"  "+result);
                    spells[i] = result;
                }
            }
        }
        Arrays.stream(spells).forEach(p-> System.out.println(p));
    }
}
