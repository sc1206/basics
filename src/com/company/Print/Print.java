package com.company.Print;

import java.util.Scanner;

/**
 * @author Administrator
 * @title: Print
 * @projectName basics
 * @description: TODO
 * @date 2020/8/39:30
 */
public class Print  {
    public void Black(){
        System.out.println("使用黑白打印机");
    }
    public void Colours(){
        System.out.println("使用彩色打印机");
    }
}
/*class Black {
    public Black(String b){
        System.out.println("使用黑白打印机");
    }
}
class Colours {
    public Colours(String c){
        System.out.println("使用彩色打印机");
    }
}*/
class Test{
    public static void main(String[] args) {
        Print pt=new Print();
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择您要使用的打印机？1：彩色打印机 2：黑白打印机");
        int writes= sc.nextInt();

        if (writes==1){
            System.out.println("您使用的彩色打印机");
            pt.Colours();
        }else {
            System.out.println("您使用的黑白打印机");
            pt.Black();
        }
        System.out.println("打印完毕");
    }
}