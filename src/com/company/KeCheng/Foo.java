package com.company.KeCheng;

/**
 * @author Administrator
 * @title: Foo
 * @projectName basics
 * @description: TODO
 * @date 2020/6/2210:50
 */
public class Foo {
    static int i = 0;
    static int j = 0;

    public static void main(String[] args) {
  /*      int i=2;
        int k=3;
        {
            int j=3;
            System.out.println("i+j"+(i+j));
        }
        k=i+j;
        System.out.println("k="+k+".j="+j+",i="+Foo.i);*/

        String[] ss = {"aa", "bb", "cc"};
        for (int i = 0; i < 100; i++) {
            for (String temp : ss) {
                System.out.println(temp);
            }
        }
    }

}
