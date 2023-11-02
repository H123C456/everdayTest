package com.ruxi.testNove;


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

