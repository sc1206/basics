package Test;

import java.util.Scanner;

public class xunhaunceshi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字判断奇数还是偶数");
        int x = sc.nextInt();
        if (x%2==0){
            System.out.println("这是一个偶数");
        }else {
            System.out.println("这是一个奇数");
            System.out.println("请输入一个数字判断奇数还是偶数");
        }
    }
}
