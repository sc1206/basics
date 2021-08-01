package Test;

import java.util.Scanner;

public class xunhuan {
    public static void main(String[] args) {

        /*do...while循环*/
        int x = 10;
        do {
            System.out.println("值为" + x);
            x++;
            System.out.println("\n");

        } while (x < 20);

        /*while循环*/
        int i = 10;
        while (i < 20) {
            System.out.println("值2为" + i);
            i++;
            System.out.println("\n");
        }

        /*for循环*/
        for (int a = 10; a < 20; a = a + 1) {
            System.out.println("值3为" + a);
            System.out.println("\n");
        }

        /*增强for循环*/
        int[] numbers = {1, 23, 3, 21, 12, 12};

        for (int s : numbers) {
            System.out.print("值3," + s);
            System.out.print(",");
        }
        System.out.println("\n");
        String[] names = {"tom", "james", "lacy", "larry"};
        for (String name : names) {
            System.out.print("名字为" + name);
            System.out.print(",");
        }
    }


}
