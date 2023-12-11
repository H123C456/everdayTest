package com.ruxi.testNove;



//给你一个下标从 0 开始的整数数组 nums ，如果满足下述条件，则认为数组 nums 是一个 美丽数组 ：
//
//nums.length 为偶数
//对所有满足 i % 2 == 0 的下标 i ，nums[i] != nums[i + 1] 均成立
//注意，空数组同样认为是美丽数组。
//
//你可以从 nums 中删除任意数量的元素。当你删除一个元素时，被删除元素右侧的所有元素将会向左移动一个单位以填补空缺，而左侧的元素将会保持 不变 。
//
//返回使 nums 变为美丽数组所需删除的 最少 元素数目。
public class MinDeleteTest {

    public static void main(String[] args) {
        //处理 nums 过程中，若当前下标为偶数，且与下一位置元素相同，那么当前元素需被删除，令 cnt 自增。

        int[] i = {1,1,2,2,3,3};
        int n = i.length;
        int rns=0;
        for (int i1 = 0; i1 < n; i1++) {

        }

    }
}
