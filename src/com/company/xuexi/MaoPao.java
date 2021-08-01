package com.company.xuexi;

import java.util.Arrays;

public class MaoPao {

    public static void main(String[] args) {

        int[] ns = {1, 2, 3, 4, 5, 6, 7, 43, 21, 34, 12, 21};
//    排序前
        System.out.println(Arrays.toString(ns));
   /*     for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    int a = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(ns));*/

        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j + 1] > ns[j]) {
                    int a = ns[j + 1];
                    ns[j + 1] = ns[j];
                    ns[j] = a;
                }
            }
        }
        System.out.println(Arrays.toString(ns));



    }
}
