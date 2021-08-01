package com.company.hanshu;

public class ChouXiang {
    public static void main(String[] args) {
        StudentTwo st = new StudentTwo();
        st.run();
    }

}

//可以将一个抽象类改写成接口
//abstract class PersonTwo {
//    public abstract void run();
//    public abstract String getName();
//}

interface PersonTwo{
    void run();
    String getName();
}

class StudentTwo implements PersonTwo {

    @Override
    public void run() {
        System.out.println("Student.run");
    }

    @Override
    public String getName() {
        return null;
    }
}

