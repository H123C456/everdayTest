package com.ruxi.testNove;

import java.sql.SQLOutput;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[] spells = {5,1,3};
        spells[2]=4;
        Arrays.stream(spells).forEach(p-> System.out.println(p));
        System.out.println(spells.length);
    }
}
