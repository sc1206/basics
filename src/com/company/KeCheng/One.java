package com.company.KeCheng;

/**
 * @author Administrator
 * @title: One
 * @projectName basics
 * @description: TODO
 * @date 2020/6/159:21
 */
public class One {
    double x=2;
    double y=3;
    double ones(double x,double y){
        double s;
        s=x*y;
        return s;
    }
    double two(double x ,double y){
        double s;
        s=this.x*this.y;
        return s;
    }

    public static void main(String[] args) {
        One o=new One();
        System.out.println(o.ones(10,10));
        System.out.println(o.two(10,10));
    }
}
