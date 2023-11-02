package com.ruxi.testNove;

//题目要求
//总计有 n 个环，环的颜色可以是红、绿、蓝中的一种。这些环分别穿在 10 根编号为 0 到 9 的杆上。
//
//给你一个长度为 2n 的字符串 rings ，表示这 n 个环在杆上的分布。rings 中每两个字符形成一个 颜色位置对 ，用于描述每个环：
//
//第 i 对中的 第一个 字符表示第 i 个环的 颜色（'R'、'G'、'B'）。
//第 i 对中的 第二个 字符表示第 i 个环的 位置，也就是位于哪根杆上（'0' 到 '9'）。
//例如，"R3G2B1" 表示：共有 n == 3 个环，红色的环在编号为 3 的杆上，绿色的环在编号为 2 的杆上，蓝色的环在编号为 1 的杆上。
//
//找出所有集齐 全部三种颜色 环的杆，并返回这种杆的数量。

public class CountPoints {

    public static void main(String[] args) {

        String rings = "B0B6G0R6R0R6G9";
        String[] split = rings.split("");

        int[][] arr = new int[10][3];
        for (int i=0;i<rings.length();i+=2){
            String color = split[i];
            if (color.equals("R")){
                arr[Integer.parseInt(split[i+1])][0]++;
            }else if (color.equals("B")){
                arr[Integer.parseInt(split[i+1])][1]++;
            }else if (color.equals("G")){
                arr[Integer.parseInt(split[i+1])][2]++;
            }
        }

        int bar=0;
        for (int i=0;i<10;i++){

            if (arr[i][1]>0&&arr[i][2]>0&&arr[i][0]>0){
                bar++;
            }
        }

        System.out.println(bar);

    }
}

