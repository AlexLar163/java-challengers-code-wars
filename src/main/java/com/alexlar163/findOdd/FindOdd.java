package com.alexlar163.findOdd;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static void main (String[] args) {
//        System.out.println(findIt(new int[]{7}));
//        System.out.println(findIt(new int[]{0}));
//        System.out.println(findIt(new int[]{1,1,2}));
//        System.out.println(findIt(new int[]{0,1,0,1,0}));
        System.out.println(findIt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
    }
    public static int findIt(int[] a) {
        int result = 0;
        // basicamente copara el binario y saca el valor
        //        1 ^ 0 = 1
        //        1 ^ 1 = 0
        //        0 ^ 1 = 1
        for (int i : a) {
            result ^= i;
        }
        return result;
    }
}
