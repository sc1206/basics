package com.company.xuexi;
import java.util.Arrays;
public class Crculation {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; ; i++) {
//            sum = sum + i;
//            if (i == 100) {
//                break;
//            }
//        }
//        System.out.println(sum);
//        for (int i = 1; i < 10; i++) {
//            System.out.println("i=" + i);
//            for (int j = 1; j <= 10; j++) {
//                System.out.println("j=" + j);
//                if (j > i) {
//                    break;
//                }
//            }
//            System.out.println("breaked");
//        }
/*        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("begin i=" + i);
            if (i % 2 == 0) {
                continue;
            }
            sum = sum + i;
            System.out.println("end i =" + i);
        }
        System.out.println(sum);*/
        /*使用常规for循环遍历数据*/
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = 0; i < ns.length; i++) {
            int n = ns[i];
            System.out.println(n);
        }
        /*使用for each 循环遍历*/
        for (int n : ns) {
            System.out.println(n);
        }
        /*还有更简洁的Arrays.toString*/
        System.out.println(Arrays.toString(ns));
        int[] nss = {1, 4, 9, 16, 25, 78, 88};
        for (int i = nss.length - 1; i >= 0; i--) {
            System.out.print("倒序输出为=" + nss[i]);
        }
    /*    for (int i=4;i>=0;i--){
            System.out.println(nss[i]);
        }*/
    }
}