package com.company.hanshu;

public class JingTai {
    public static void main(String[] args) {

        PersonFor chen = new PersonFor("chen", 12);
        PersonFor shen = new PersonFor("shen", 15);
        chen.number = 88;
        System.out.println(chen.number);
        shen.number = 99;
        System.out.println(shen.number);
    }
}

class PersonFor {
    public String name;
    public int age;
    public static int number;

    public PersonFor(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

