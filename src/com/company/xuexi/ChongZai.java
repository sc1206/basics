package com.company.xuexi;
class Hello {
    public void Hello() {
        System.out.println("Hello,world");
    }
    public void Hello(String name) {
        System.out.println("Hello" + name);
    }
    public void Hello(String name, int age) {
        System.out.println("Hello" + name + "你今年" + age + "岁了");
    }
    public static void main(String[] args) {
        Hello he = new Hello();
        he.Hello();
        he.Hello("徐州新东方烹饪学校", 32);
    }
}