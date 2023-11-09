package com.ruxi.testNove;


import org.yaml.snakeyaml.events.Event;

import java.util.PrimitiveIterator;

public class MySqrt {

    public static void main(String[] args) {
        int x=2147395599;
        int right=x;
        int left=1;
        int middle;
        int previous=0;
        int num=0;
        middle=(right+left)/2;
        while (right-left>=0){
            if (middle*middle>x){
                right=right/2;
                middle=(right+left)/2;
            }else if (middle*middle<x){
                left++;
                middle=(right+left)/2;
                previous=middle;
                if (previous*previous<x&&(previous+1)*(previous+1)>x){

                num = previous;
                break;
                }
                if (previous==0||x==2||x==1){
                    num=1;
                    break;
                }

            }else {
                num = middle;
                break;
            }
        }
        System.out.println(num);
    }
}
