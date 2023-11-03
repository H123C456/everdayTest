package com.ruxi.testNove;


public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"a"};
        String result = "";
        if (strs!=null){
            String shorts = strs[0];
            if (strs.length>1){
                for (int i=1;i<strs.length;i++){
                    if (strs[i].length()<shorts.length()){
                        shorts = strs[i];
                    }
                }
                for (int i=1;i<strs.length;i++){
                    for (int j=0;j<shorts.length();j++){
                        String substring = shorts.substring(0,j);
                        if (strs[i].indexOf(substring)!=-1){
                            result = substring;
                        }else {
                            break;
                        }
                    }
                }
            }else {
                result = strs[0];
            }
        }
        System.out.println(result);
    }

}
