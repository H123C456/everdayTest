package com.ruxi.testNove;

public class VowelStrings {

    public static void main(String[] args) {
        String[] words={"are","amy","u"};
        int left = 0;
        int right = 2;
        String single;
        int result=0;
        for (int i=left;i<=right;i++){
            single = words[i];
            if (single.startsWith("a")||single.startsWith("e")||single.startsWith("i")||single.startsWith("u")||single.startsWith("o")){
                if (single.endsWith("a")||single.endsWith("e")||single.endsWith("i")||single.endsWith("u")||single.endsWith("o")){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
