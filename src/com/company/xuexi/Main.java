package com.company.xuexi;

public class Main {
    public static void main(String[] args) {
//        因为student是person的子类拥有person的全部功能Person类型的变量，如果指向Student类型的实例
//        对他进行操作,是没有问题,向上转型
        Student s = new Student("xzxdf", 32, 100);
        Persons p = s;
        Object o = p;
        Object o2 = s;
        /*向下转型
         * */
        Persons p2 = new Student("xzxdf", 32, 100);
        Persons p3 = new Persons();
        Student s1 = (Student) p2;
        Student s2 = (Student) p3;

    }
}

class Persons {
    protected String name;
    protected int age;

    public void Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Persons {
    protected int score;

    public Student(String name, int age, int score) {
        super();
        this.score = score;
    }

}
