package com.company.hanshu;

public class FangFaLianXi {
    public static void main(String[] args) {
        PrimaryStudent ps = new PrimaryStudent("xzxdf", 32, 1, "1901班");
        System.out.println("我是" + ps.getName() + "今年是第" + ps.getAge() + "了" + ps.getScore() + "年级" + ps.getGrade() + "的");
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run() {
        System.out.println("Person run");
    }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Hello World");
    }
}

class PrimaryStudent extends Student {
    protected String grade;

    public PrimaryStudent(String name, int age, int score, String grade) {
        super(name, age, score);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}