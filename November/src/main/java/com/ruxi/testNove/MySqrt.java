package com.ruxi.testNove;


import org.yaml.snakeyaml.events.Event;

import javax.xml.bind.annotation.XmlID;
import java.util.PrimitiveIterator;

public class MySqrt {

    public static void main(String[] args) {
        int x=2147483647;
        //int x=40000;
//        int right=x;
//        int left=0;
//        int middle;
//        int previous=0;
//        int num=0;
//        middle=(right+left)/2;
//        while (right-left>=0){
//            if (middle>x/middle){
//                right=middle;
//                middle/=2;
//            }else if (middle<x/middle){
//                left=middle;
//                middle=(right+left)/2;
//                previous=middle;
//
//                if (previous==0||x==2||x==1){
//                    num=1;
//                    break;
//                }
//
//            }else {
//                num = middle;
//                break;
//            }
//        }
//        System.out.println(num);

//        int l=0;
//        int r=x;
//        int ans=-1;
//        int mid;
//        while (l<=r){
//            mid=(l+r)/2;
//            if (mid*mid<=x){
//                ans = mid;
//                l = mid+1;
//            }else
//                r = mid-1;
//        }
//        System.out.println(ans);

        int l = 0, r = x, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(ans);

    }
}
