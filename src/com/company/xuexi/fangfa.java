package com.company.xuexi;

class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

public class fangfa {
    public static void main(String[] args) {
        Person ps = new Person("交作业啦", 32);
        Person ps2 = new Person();
        System.out.println(ps.getName());
        System.out.println(ps2);
    }
}