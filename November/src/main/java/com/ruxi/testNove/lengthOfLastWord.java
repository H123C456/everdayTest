package com.ruxi.testNove;

import java.util.Arrays;

public class lengthOfLastWord {

    public static void main(String[] args) {
        String s = "";

        if (s==null||s==""){
            System.out.println("这是空的");
        }else {
            String[] s1 = s.split(" ");
            int length = s1[s1.length - 1].length();
            System.out.println(length);
        }
    }
}
