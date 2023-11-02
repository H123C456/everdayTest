package com.ruxi.testNove;

import java.util.*;

public class CountPoints {

    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        String regex = "[0-9]";
        String regex1 = "[A-Z]";


        String[] letter = rings.split(regex);
        rings.split(regex1)
        Arrays.stream(letter).forEach(p-> System.out.print(p));
        System.out.println();
        Arrays.stream(num).forEach(p-> System.out.print(p));


        List<String> testList = new ArrayList<>();

        for (int i=0;i< num.length;i++){
            if (num[i]==""){
                continue;
            }
            int i1 = Integer.parseInt(num[i]);
            System.out.println(i1);

        }



    }
}

